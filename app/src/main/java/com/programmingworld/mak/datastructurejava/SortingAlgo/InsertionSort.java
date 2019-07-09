package com.programmingworld.mak.datastructurejava.SortingAlgo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
         int[] arr={12, 11, 13, 5, 6};
        for(int i=0;i<arr.length-1;i++){

            for(int j=i;j>=0;j--){
                 if(arr[j+1]<arr[j]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     System.out.println(i);
                 }else{
                     break;
                 }
            }
        }




        System.out.println(Arrays.toString(arr));
    }
}
