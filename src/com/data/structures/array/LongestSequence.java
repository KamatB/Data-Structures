package com.data.structures.array;

public class LongestSequence {

        public static void main(String[] args) {
            System.out.println(longestSequence("dvdf"));
        }

        public static int longestSequence(String word) {
            StringBuilder str=new StringBuilder();
            String subSequence = "";
            for(int i=0;i<word.length();i++){
                if(str.indexOf(String.valueOf(word.charAt(i))) !=-1 && subSequence.length()<str.toString().length()){
                    subSequence=str.toString();
                    str=new StringBuilder();
                    str.append(word.charAt(i));
                }else{
                    str.append(word.charAt(i));
                }
            }
            return str.toString().length();
             }

//            StringBuilder strBu = new StringBuilder();
//            String finalString = new String();
//            for (int i = 0; i < s.length(); i++) {
//                char ch = s.charAt(i);
//                if (strBu.toString().contains(String.valueOf(ch))) {
//                    if (strBu.toString().length() > finalString.length()) {
//                        finalString = strBu.toString();
//                    }
//                    strBu = new StringBuilder();
//                    strBu.append(ch);
//                } else {
//                    strBu.append(ch);
//                }
//            }
//            if (strBu.toString().length() > finalString.length()) {
//                finalString = strBu.toString();
//            }
//            return finalString.length();
       // }
}
