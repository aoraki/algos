package jk.codespace.solutions;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RomanToIntegerSolution {

    private class DictionaryItem {
        final String romanNumeral;
        final int decimalValue;

        public DictionaryItem(String romanNumeral, int decimalValue){
            this.romanNumeral = romanNumeral;
            this.decimalValue = decimalValue;
        }
    }

    private LinkedHashSet<DictionaryItem> dictionary = new LinkedHashSet<DictionaryItem>();

    private void createDictionary(){
        dictionary.add(new DictionaryItem("M", 1000));
        dictionary.add(new DictionaryItem("CM", 900));
        dictionary.add(new DictionaryItem("D", 500));
        dictionary.add(new DictionaryItem("CD", 400));
        dictionary.add(new DictionaryItem("C", 100));
        dictionary.add(new DictionaryItem("XC", 90));
        dictionary.add(new DictionaryItem("L", 50));
        dictionary.add(new DictionaryItem("XL", 40));
        dictionary.add(new DictionaryItem("X", 10));
        dictionary.add(new DictionaryItem("IX", 9));
        dictionary.add(new DictionaryItem("V", 5));
        dictionary.add(new DictionaryItem("IV", 4));
        dictionary.add(new DictionaryItem("I", 1));
    }

    public int romanToInt(String s) {
        this.createDictionary();
        int runningTotal = 0;

        Iterator<DictionaryItem> it = dictionary.iterator();
        while (it.hasNext() && s.length() > 0){
            DictionaryItem item = it.next();
            while (s.indexOf(item.romanNumeral) == 0){
                runningTotal += item.decimalValue;
                s = s.replaceFirst(item.romanNumeral, "");
            }
        }
        return runningTotal;
    }

}
