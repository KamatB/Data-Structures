package com.data.structures.array;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
//        int i=0;
//        int j=nums.length-1;
//        int n=nums.length;
        int[] indices=new int[2];

//        while(i<n && j>0){
//            if((nums[i]+nums[j])>target){
//                j--;
//            }else if((nums[i]+nums[j])<target){
//                i++;
//            }else{
//                indices[0]=i;
//                indices[1]=j;
//                return indices;
//            }
//        }

//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if((nums[i]+nums[j])==target){
//                    indices[0]=i;
//                    indices[1]=j;
//                    return indices;
//                }
//            }
//        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];

            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
       // return indices;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
