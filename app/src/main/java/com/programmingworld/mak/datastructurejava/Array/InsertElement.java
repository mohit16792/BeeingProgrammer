package com.programmingworld.mak.datastructurejava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {



     public static void main(String[] args) {
         int arr[]=new int[10];
         arr[0]=1;
         arr[1]=2;
         arr[2]=3;
         arr[3]=5;
         arr[4]=6;
         arr[5]=7;
         arr[6]=8;
         int index;
         int value;
         System.out.println("please enter the index");
         Scanner scanner=new Scanner(System.in);
         index= scanner.nextInt();
         System.out.println("please enter the element to insert");
         value= scanner.nextInt();
         InsertElement insertElement=new InsertElement();
         insertElement.insert(arr,index,value);
     }

     public void insert(int arr[],int index,int element){

/*
   Ashu logic

  /*

 */
//         for(int i=index+1;i<arr.length-1 && i!=0;i++)
//         {
//             int temp = arr[i];
//             arr[i] = arr[index];
//             arr[index] = temp;
//         }
//         arr[index]=element;
         arr[arr.length-1]=element;
         for(int i=index;i<arr.length && i!=0;i++)
         {
             int temp=arr[i];
             arr[i]=arr[arr.length-1];
             arr[arr.length-1]=temp;

         }

         printArray(arr);
     }
     public void printArray(int arr[]){
         System.out.println(Arrays.toString(arr));
     }
 }
