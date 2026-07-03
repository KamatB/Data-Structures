package com.data.structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums={2,2,2,2,2};
        System.out.println(fourSum(nums,8));

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> resultList=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            //if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length-2;j++){
               // if(j>i && nums[j]==nums[j-1])continue;
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> newList=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        if(!resultList.contains(newList)){
                            resultList.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        }
                        while(left<right && nums[left]==nums[left+1])left++;
                        while(left<right && nums[right]==nums[right-1])right--;
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return resultList;
    }
}
