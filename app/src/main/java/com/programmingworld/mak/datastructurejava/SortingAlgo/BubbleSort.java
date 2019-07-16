package com.programmingworld.mak.datastructurejava.SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    int[] arr = {13, 12, 11, 5, 7, 56, 53, 12, 345};
    int counter = arr.length - 1;

    /* this is a recusrive method */
    public void sort() {


        for (int i = 0; i < counter; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;

            }
        }
        if (counter >0) {
            counter--;
            sort();

        }


    /* this is itterative method
    int counter=arr.length-1;
    public void sort(){
        for(int i=0;i<counter-i;i++){
            for(int j=0;j<counter-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            counter++;
        }

    }
    */

    }
}
class Test{
    public static void main(String[] args) {
    BubbleSort bubbleSort=new BubbleSort();
    bubbleSort.sort();
    System.out.println(Arrays.toString(bubbleSort.arr));
    }
}

