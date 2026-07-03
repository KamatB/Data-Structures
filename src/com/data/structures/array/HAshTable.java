package com.data.structures.array;

import java.util.Arrays;
import java.util.Hashtable;

public class HAshTable {

    public static void main(String[] args) {
        String s1="abab";
        String s2="jkjwabioabo";
        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
         int[] s1Arr=new int[26];
         int[] s2Arr=new int[26];

         for(int i=0;i<s1.length();i++){
             s1Arr[s1.charAt(i)-'a']++;
         }
         int windowSize=s1.length();

        for(int j=0;j<s2.length();j++){
            s2Arr[s2.charAt(j)-'a']++;

            if(j>=windowSize){
                s2Arr[s2.charAt(j-windowSize)-'a']--;
            }

            if(Arrays.equals(s1Arr,s2Arr)){
                return true;
            }
        }
      return false;
    }
}
