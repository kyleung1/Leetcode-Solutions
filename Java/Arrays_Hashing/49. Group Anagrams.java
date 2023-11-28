package Java.Arrays_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String currentStr = strs[i];
            char[] charArr = currentStr.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
            if (map.containsKey(sortedStr) == false) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(currentStr);
        }

        return new ArrayList<>(map.values());
    }
}