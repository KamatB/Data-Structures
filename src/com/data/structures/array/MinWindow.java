package com.data.structures.array;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
    public static void main(String[] args) {
        System.out.println(minWindow("aa", "aa"));
    }

    public static String minWindow(String s, String t) {
        int left = 0;
        int right = t.length()-1;
        boolean isPresent = false;
        int minWindow = 0;
        String finalString = "";
        Map<Character,Integer> charMap=new HashMap<>();
        for (char c : t.toCharArray()) {
            charMap.put(c, 0);
        }
        while (left < s.length() && right < s.length()) {
            Map<Character,Integer> subStringWindow=new HashMap<>();
            for(char c:s.toCharArray()){
                subStringWindow.put(c,subStringWindow.getOrDefault(c,0)+1);
            }

            for(char c: charMap.keySet()){
                if(subStringWindow.getOrDefault(c,0)<charMap.get(c)){
                    isPresent=false;
                }
            }
            if (isPresent) {
                String str=s.substring(left,right+1);
                if (finalString.isEmpty() || str.length()<finalString.length()) {
                    finalString=str;
                }
                left++;
            } else {
                right++;
            }
        }
        return finalString;
    }
}
