package com.programmingworld.mak.datastructurejava;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String result="";
        String name="my name is is mohtit mohit";
        for(int i=0;i<name.length();i++){
            if(!result.contains(String.valueOf(name.charAt(i)))){
                result+=String.valueOf(name.charAt(i));
            }
        }

    }
}
