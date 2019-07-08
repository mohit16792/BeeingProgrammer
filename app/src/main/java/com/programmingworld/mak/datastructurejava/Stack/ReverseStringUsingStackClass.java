package com.programmingworld.mak.datastructurejava.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStackClass {

    public void reverseString(){
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }

    }
}
class ReverseStringTest{
    public static void main(String[] args) {
        ReverseStringUsingStackClass rsusc=new ReverseStringUsingStackClass();
        System.out.println("please enter the string to reverse");
        rsusc.reverseString();

    }


}
