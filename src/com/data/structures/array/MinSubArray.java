package com.data.structures.array;

public class MinSubArray {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(minSubArrayLen(target,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minSubArray=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                minSubArray=Math.min(right-left+1,minSubArray);
                sum=sum-nums[left++];
            }
        }
        return minSubArray==Integer.MAX_VALUE?0:minSubArray;
    }
}
