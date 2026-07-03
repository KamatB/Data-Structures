package com.data.structures.array;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str="a*(b+c)/d";
        System.out.println(infixToPostfix(str));
    }

    public static String infixToPostfix(String str){
        Stack<Character> stack=new Stack<>();
        StringBuilder strBu=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')){
                strBu.append(str.charAt(i));
            }


            if((str.charAt(i)=='/' || str.charAt(i)=='*')){
                while ((!stack.isEmpty()) && (stack.peek() == '*' || stack.peek()=='/')){
                    strBu.append(stack.pop());
                }
                stack.push(str.charAt(i));
            }else if(str.charAt(i)=='/' || str.charAt(i)=='*'){
                stack.push(str.charAt(i));
            }


            if((str.charAt(i)=='+' || str.charAt(i)=='-') ) {
                while ((!stack.isEmpty()) && (stack.peek() == '*' || stack.peek() == '/' || str.charAt(i) == stack.peek())) {
                    strBu.append(stack.pop());
                }
                stack.push(str.charAt(i));
            }
//            }else if(str.charAt(i)=='+' || str.charAt(i)=='-'){
//                stack.push(str.charAt(i));
//            }


//             if(!stack.isEmpty() && str.charAt(i)==stack.peek()){
//                 strBu.append(stack.pop());
//                 stack.push(str.charAt(i));
//             }


            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            if(str.charAt(i)==')' && !stack.isEmpty()){
                while(stack.peek()!='('){
                    strBu.append(stack.pop());
                }
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            strBu.append(stack.pop());
        }
        return strBu.toString();
    }
}
