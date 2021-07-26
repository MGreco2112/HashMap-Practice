package com.company;

import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (Integer num : nums) {
            if (!numsMap.containsKey(num)) {
                numsMap.put(num, 1);
            } else {
                int count = numsMap.get(num);
                count++;
                numsMap.put(num, count);
            }
        }

        int majorityElement = nums.length / 2;
        int output = 0;

        for (int num : numsMap.keySet()) {
            if (numsMap.get(num) > majorityElement) {
                output = num;
            }
        }

        return output;

    }

}
