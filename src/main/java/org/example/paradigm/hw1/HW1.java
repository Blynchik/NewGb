package org.example.paradigm.hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        HW1 hw1 = new HW1();
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(1);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(15);

        System.out.println(hw1.sort2(nums));
    }

    public List<Integer> sort1(List<Integer> nums) {
        if (nums == null) {
            return Collections.emptyList();
        }

        List<Integer> sorted = new ArrayList<>();
        for (int j = 0; j < nums.size(); j++) {
            sorted.add(nums.get(j));
            for (int i = sorted.size() - 1; i > 0; i--) {
                if (sorted.get(i - 1) < sorted.get(i)) {
                    Integer temp = sorted.get(i - 1);
                    sorted.set(i - 1, sorted.get(i));
                    sorted.set(i, temp);
                } else {
                    break;
                }
            }
        }
        return sorted;
    }

    public List<Integer> sort2 (List<Integer> nums){
        return nums.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
