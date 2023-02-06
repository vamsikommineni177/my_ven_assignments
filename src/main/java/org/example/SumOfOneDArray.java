package org.example;
import java.util.Arrays;

public class SumOfOneDArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,9,3,24};
        System.out.println("given input Array : "+Arrays.toString(nums));
        System.out.println("running Sum for given input: "+Arrays.toString(nums)+" is "+Arrays.toString(runningSum(nums)));
    }
}
