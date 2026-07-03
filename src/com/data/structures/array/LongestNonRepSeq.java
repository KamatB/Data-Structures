package com.data.structures.array;

public class LongestNonRepSeq {
    public static void main(String[] args) {
       String str="abaabeebaccce";
       System.out.println(nonRepeatingSequence(str));
    }

    public static Integer nonRepeatingSequence(String str){
        StringBuilder strBuf=new StringBuilder();
        String finalSequence="";
        for(int i=0;i<str.length();i++){
            if(strBuf.toString().contains(String.valueOf(str.charAt(i)))){
                strBuf=new StringBuilder();
                strBuf.append(str.charAt(i));
            }else{
                strBuf.append(str.charAt(i));
            }
            if(strBuf.toString().length()>finalSequence.length()){
                finalSequence=strBuf.toString();
            }
        }
        return finalSequence.length();
    }
}
