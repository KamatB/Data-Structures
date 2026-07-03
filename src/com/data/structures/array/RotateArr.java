package com.data.structures.array;

public class RotateArr {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
//        int num=nums[0];
//        int n=nums.length;
//        int j=1;
//        while(j<n){
//            if(nums[j]==num){
//                int k=j;
//                while(k<n-1){
//                    nums[k]=nums[k+1];
//                    k++;
//                }
//                n--;
//            }else{
//                num=nums[j];
//                j++;
//            }
//        }
//
//        return n;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
