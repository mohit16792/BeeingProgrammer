package com.programmingworld.mak.datastructurejava.MedologyCompany;

public class FindDMissingNo {
    public static void main(String[] args) {
        int[] arr ={10,8,1,2,7,5,4,3,9};
        int sum=0;
        int totalSum=0;
        int n=arr.length+1;

        for(int i=0;i<=arr.length;i++){

            totalSum=totalSum+i+1;
            if(i==arr.length){
                break;
            }else{
                sum=sum+arr[i];
            }

        }
        System.out.println(totalSum-sum);

    }
}
