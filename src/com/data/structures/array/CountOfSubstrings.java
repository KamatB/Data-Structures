package com.data.structures.array;

import java.util.ArrayList;

public class CountOfSubstrings {
    public static void main(String[] args) {
        String arr = "00100101";
        returnMaxElement(arr);
    }

    public static void returnMaxElement(String str){
        ArrayList<String> strList=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String strNew=str.substring(i,j+1);
                int n=strNew.length();
                if(strNew.charAt(0)=='1' && strNew.charAt(n-1)=='1' && n>1){
                    strList.add(strNew);
                }
            }
        }

        System.out.println(strList.size());
    }
}
