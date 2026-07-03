package com.data.structures.array;

public class StringToInteger {
    public static void main(String[] args) {
       // myAtoi("   -042");
        System.out.println(myAtoi("+-12"));
    }
    public static int myAtoi(String s) {
        StringBuilder strBu=new StringBuilder();
        int strToInt=0;
        int sign=1;
        if(s.equals("")){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!strBu.toString().equals("")){
                char strBuCh=strBu.charAt(strBu.length()-1);
                if((strBuCh>='0' && strBuCh<='9') && !(ch>='0' && ch<='9')){
                    break;
                }
            }
            if(i == 0 && !(ch == ' ' || ch == '-' || ch == '+' || (ch >= '0' && ch <= '9'))){
                return strToInt;
            }
            if(ch=='-'){
                sign=-1;
            }

            if(ch>='0'&&ch<='9'){
                strBu.append(ch);
            }else if(ch>='a' && ch<='z'){
                break;
            }else if(ch==' '){
                continue;
            }
        }

        int j=0;
        int n=strBu.length();
        long result=0;
        while(j<n && Character.isDigit(strBu.charAt(j))){
            int digit = strBu.charAt(j) - '0';
            result = result * 10 + digit;

            if(sign*result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sign*result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            j++;
        }
        return (int)(sign*result);
    }
}
