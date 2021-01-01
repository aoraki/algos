package jk.codespace.solutions.leetcode;

/*
Solution for leetcode problem;
https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Example 5:
Input: s = "{[]}"
Output: true


Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'
*/

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class ValidParenthesesSolution {

    ArrayList<String> openParens = new ArrayList<>();
    ArrayList<String> closeParens = new ArrayList<>();
    ArrayList<ParenTuple> parenTuples = new ArrayList<>();

    public boolean isValid(String s) {
        init();
        boolean isValid = true;

        Stack<ParenTuple> parensStack = new Stack<>();

        if((s.length() % 2) == 0) {
            for (int i = 0; i < s.length(); i++) {
                String paren = Character.toString(s.charAt(i));
                ParenTuple rt;
                boolean isOpen = true;

                if (this.openParens.contains(paren)) {
                    rt = new ParenTuple(paren, "");
                } else {
                    rt = new ParenTuple("", paren);
                    isOpen = false;
                }

                ParenTuple pt = parenTuples.get(parenTuples.indexOf(rt));

                if (isOpen) {
                    parensStack.push(pt);
                } else {
                    if(!parensStack.empty()) {
                        ParenTuple ptTop = parensStack.peek();
                        if (ptTop.equals(pt)) {
                            parensStack.pop();
                        } else {
                            isValid = false;
                            break;
                        }
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
        } else {
            isValid = false;
        }

        if(!parensStack.empty()){
            isValid = false;
        }

        return isValid;
    }


    private class ParenTuple {
        public final String openParen;
        public final String closeParen;

        public ParenTuple(final String openParen, final String closeParen){
            this.openParen = openParen;
            this.closeParen = closeParen;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParenTuple that = (ParenTuple) o;
            return openParen.equals(that.openParen) ||
                    closeParen.equals(that.closeParen);
        }

        @Override
        public int hashCode() {
            return Objects.hash(openParen, closeParen);
        }
    }

    private void init(){
        this.parenTuples.add(new ParenTuple("(", ")"));
        this.parenTuples.add(new ParenTuple("{", "}"));
        this.parenTuples.add(new ParenTuple("[", "]"));
        this.openParens.add("(");
        this.openParens.add("{");
        this.openParens.add("[");
        this.closeParens.add(")");
        this.closeParens.add("]");
        this.closeParens.add("}");
    }
}
