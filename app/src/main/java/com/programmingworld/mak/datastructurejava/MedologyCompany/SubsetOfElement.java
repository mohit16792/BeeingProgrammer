package com.programmingworld.mak.datastructurejava.MedologyCompany;

public class SubsetOfElement {
    public static void main(String[] args) {
        //{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}

        int[] arr={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
                System.out.println(arr[j]+","+arr[j+1]);
            }
            System.out.println();
        }

        String s="12:13:02";
        String[] hoursArray=s.split("");
        int hrs=Integer.parseInt(hoursArray[0]+hoursArray[1]);
        if(s.charAt(0)=='1'&&s.charAt(1)=='2'){

           s= "0"+"0"+s.substring(2,s.length());
           System.out.println(s);

        }

    }
}
