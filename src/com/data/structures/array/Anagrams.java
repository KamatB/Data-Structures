package com.data.structures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abab", "ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int left=0;
        int[] window = new int[26];
        int[] strWindow=new int[26];
        for(char c:p.toCharArray()){
            strWindow[c-'a']++;
        }
        int range=p.length()-1;
        List<Integer> anagramArr=new ArrayList<>();
        for(int right=0;right<s.length();right++){
            int j=left;
            while(j<=right){
                if(p.contains(String.valueOf(s.charAt(right)))){
                    window[s.charAt(j)-'a']++;
                }
                j++;
            }



            if(right-left==range){
                if(Arrays.equals(window,strWindow)){
                    anagramArr.add(left);
                }
                window=new int[26];
                left++;
            }else{
                window=new int[26];
            }

//            if(right-left==range){
//                boolean isMatch=isMatch(window,p,left,right);
//                if(isMatch){
//                    anagramArr.add(left);
//                }
//                window=new int[26];
//                left++;
//            }
        }
        return anagramArr;
    }

    public static boolean isMatch(int[] window, String p, int left, int right){
        boolean isMatch=true;
        for(int i=left;i<=right;i++){
            if(window[i]!=1){
                isMatch=false;
                break;
            }
        }
        return isMatch;
    }
}
