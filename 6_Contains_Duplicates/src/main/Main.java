package main;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> test = new HashSet<>();

        for (int num : nums) {
            test.add(num);
        }

        return (nums.length > test.size());

    }

    public static void main(String[] args) {
	int[] nums = { 1, 2, 3, 3, 4};
        System.out.println(containsDuplicate(nums));
    }
}
