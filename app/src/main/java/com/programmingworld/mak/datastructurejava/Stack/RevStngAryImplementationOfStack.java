package com.programmingworld.mak.datastructurejava.Stack;

import java.util.Scanner;

public class RevStngAryImplementationOfStack {

    String name;
    String arr[]=new String[9];
    int top=-1;

    public void push(){
        System.out.println("please enter any string to reverse of 10 length");
        Scanner scanner=new Scanner(System.in);
        name= scanner.nextLine();
        for(int i=0;i<name.length();i++){
            arr[i]= String.valueOf(name.charAt(i));
            top++;
        }
        pop();
    }
    public int isStackEmpty(){
        if(top==-1){
            return -1;
        }
        return top;
    }
    public void pop(){
        if(isStackEmpty()>=0){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[top]);
                top--;
            }
        }else{
            System.out.println("stack is empty");
        }
    }


}
class ReverseStingTest{
    public static void main(String[] args) {
        RevStngAryImplementationOfStack revStng=new RevStngAryImplementationOfStack();
        revStng.push();


    }
}
