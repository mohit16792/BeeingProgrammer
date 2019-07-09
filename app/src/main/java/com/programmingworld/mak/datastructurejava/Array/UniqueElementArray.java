package com.programmingworld.mak.datastructurejava.Array;

import java.util.Arrays;

public class UniqueElementArray {

    public static void main(String[] args) {
        String[] name1={"mohit","ashu","pant","harry"};
        String[] name2={"mohit","ashu","lala","kammu","bander"};
        String[] newArray=new String[name1.length+name2.length];
        int index=0;
        for(int i=0;i<name1.length;i++){
                newArray[i]=name1[i];
        }

        for(int k=0;k<name2.length;k++){
            if(name2[k]!=newArray[k]){
                newArray[name1.length+index]=name2[k];
                index++;
            }
        }

//        for(int j=0;j<name2.length;j++){
//            if(!newArray[j].equals(name2[j])){
//                newArray[name2.length]=name2[j];
//            }
//        }
        System.out.println(Arrays.toString(newArray));
    }
}
