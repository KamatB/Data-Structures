package com.data.structures.array;

public class StringRotation {
    public static void main(String[] args){
        String s1="test1";
        String s2="llohe";
       if(stringRotation(s1,s2,2)){
           System.out.println("Strings are equal");
       }else {
           System.out.println("Strings are not equal");
       }
    }

    public static boolean stringRotation(String s1, String s2, int d){
        for(int i=0;i<s1.length();i++){
            if(s1.equals(s2)){
                return true;
            }
            s1=s1.charAt(s1.length()-1)+s1.substring(0,s1.length()-1);
        }
        return false;
    }
}
