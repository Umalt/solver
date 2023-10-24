package leetcode.easy;

import java.util.Arrays;

public class RunningSumSolution {

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2, 10, 1 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}