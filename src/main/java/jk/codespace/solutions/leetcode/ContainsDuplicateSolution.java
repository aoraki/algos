package jk.codespace.solutions.leetcode;

import java.util.Arrays;

/*
Solution for leetcode problem;
https://leetcode.com/problems/contains-duplicate/

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true

Example 2:
Input: [1,2,3,4]
Output: false

Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
public class ContainsDuplicateSolution {

    public boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return containsDuplicate;
    }
}
