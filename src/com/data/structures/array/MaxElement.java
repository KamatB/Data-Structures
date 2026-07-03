package com.data.structures.array;

import java.util.HashMap;

public class MaxElement {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 4, 2, 2, 5};
        returnMaxElement(arr);
    }

    public static void returnMaxElement(Integer[] arr){
        HashMap<Integer,Integer> hMap=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(hMap.containsKey(arr[i])){
                hMap.put(arr[i],hMap.get(arr[i])+1);
            }else{
                hMap.put(arr[i],++count);
            }
        }

        for(Integer key:hMap.keySet()){
            if(hMap.get(key)>n/2){
                System.out.println("Max count element="+key);
                return;
            }
        }

    }
}
