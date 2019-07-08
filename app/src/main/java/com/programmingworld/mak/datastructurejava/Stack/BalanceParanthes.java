package com.programmingworld.mak.datastructurejava.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class BalanceParanthes {

    int top=-1;
    ArrayList<String> arr=new ArrayList();
    public void push(String s1){
        for(int i=0;i<s1.length();i++){
            if(Character.toString(s1.charAt(i)).equals("(")){
                top++;
                //arr[i]= String.valueOf(s1.charAt(i));
                arr.add(String.valueOf(s1.charAt(i)));

            }

            //System.out.print("\n value of i" +i+"\n");
            //System.out.print("value of top"+top);
            if(top == -1 && Character.toString(s1.charAt(i)).equals(")")){
                System.out.println("this is not a balance paranthess string");
                return;
            }
            if((arr.get(top).equals("("))&&(Character.toString(s1.charAt(i)).equals(")"))){
                //arr[top]=")";
                //arr.add(top,")");
                arr.remove(top);
                top--;
            }
        }
        if (top == -1) {

            System.out.print("this is a balance paranthess string");
        }else{
            System.out.println("this is not a balance paranthess string");
        }
        System.out.println(Arrays.toString(arr.toArray()));
       // System.out.println(ArrayList.toString(ar));
    }
}
class BalanceParanthessTest{
    public static void main(String[] args) {
        String s1="(a+(b+c))";
        String s2="((a+b)";
        String s3 = "){({{{{))";
        BalanceParanthes balanceParanthes=new BalanceParanthes();
        balanceParanthes.push(s2);
    }
}
