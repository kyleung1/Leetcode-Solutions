package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) == false) {
                map.put(nums[i], 0);
            }
            int currentValue = map.get(nums[i]);
            currentValue++;
            map.put(nums[i], currentValue);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
        (e1, e2) -> e2.getValue() - e1.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }

        int [] answer = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = queue.poll();
            answer[i] = entry.getKey();
        }
        
        return answer;

    }
}