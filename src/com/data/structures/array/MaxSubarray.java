package com.data.structures.array;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }


    public static int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],nums[i]+sum);
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
