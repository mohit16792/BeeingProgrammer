package com.programmingworld.mak.datastructurejava.MedologyCompany;

public class PrintMaximum {

    public static void main(String[] args) {
        int[] arr={2,1,2,3,5,4,8,6,7,10,20,1,2};

        for(int i=0;i<arr.length;i++){
            boolean isFound=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    System.out.println(arr[i]+","+arr[j]);
                    isFound=false;
                    break;
                }
            }
            if(isFound){
                System.out.println(arr[i]+",-1");
            }


        }
    }
}
