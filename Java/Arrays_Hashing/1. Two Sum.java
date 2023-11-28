package Java.Arrays_Hashing;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // keep track of complements and their indices in the hashmap
        int answer[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) { // check if map contains complement to current nums[i] value
                answer[0] = map.get(complement);
                answer[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return answer;
    }
}