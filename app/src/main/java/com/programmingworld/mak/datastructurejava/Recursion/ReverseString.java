package com.programmingworld.mak.datastructurejava.Recursion;

public class ReverseString {

    public void reverse(String name){
        int count=0;

        if(name==null||name.length()<=1){
             System.out.println(name);
        }else{
            System.out.print(name.charAt(name.length()-1));
            reverse(name.substring(0,name.length()-1));



        }
    }
}
class ReverseStringTest{
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        reverseString.reverse("My name is Mohit Pant");
        String name="My name is mohit pant";
        String[] array=name.split(" ");
        int top=array.length-1;
        for(int i=0;i<array.length;i++){
            System.out.print(" " +array[top]);
            top--;
        }


    }
}
