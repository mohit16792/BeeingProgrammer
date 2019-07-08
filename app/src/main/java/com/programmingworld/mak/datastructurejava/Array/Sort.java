package com.programmingworld.mak.datastructurejava.Array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
         int[] arr={6,5,3,1,8,7,2,4};
//         for(int i=0;i<arr.length-1;i++)
//         {
//
//              for(int j=i;j>=0;j--){
//                   if(arr[j+1]<arr[j]){
//                       int temp=arr[j+1];
//                       arr[j+1]=arr[j];
//                       arr[j]=temp;
//
//                   }
//              }
//
//         }

        for(int i=0;i<arr.length-1;i++){

            for(int j=i;j>=0;j--){
                 if(arr[j+1]<arr[j]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }else{
                     break;
                 }
            }
        }
       



        System.out.println(Arrays.toString(arr));
    }
}
