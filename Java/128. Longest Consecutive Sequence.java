package Java;

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;

        for (int num: nums) {
            set.add(num);
        }

        for (int num: nums) {
            if (!set.contains(num-1)) {
                int length = 0;
                while (set.contains(num + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            } 
        }
        return longest;
    }
}