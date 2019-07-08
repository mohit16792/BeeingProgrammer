package com.programmingworld.mak.datastructurejava.Array;

public class ReverseArray {
    int arr[]={10,20,30,40,50,60,70,80,90};
    public void resverse()
    {
        int start=0;
        int end=arr.length-1;
        int temp;
        while(start<end){
           temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
class ReverseTest{
    public static void main(String[] args) {
        ReverseArray reverseArray=new ReverseArray();
        reverseArray.resverse();
    }
}
