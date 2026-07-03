package com.data.structures.array;

public class ArrayRotation {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        arrayRotation(arr,2);
    }

    public static void arrayRotation(int[] arr,int d){
        int i=arr[0];
        int n=arr.length;
        d=0;
        while(d<2){
            for(int j=0;j< n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=i;
            i++;
            d++;
        }

        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
