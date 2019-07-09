package com.programmingworld.mak.datastructurejava.Array;

import android.widget.ArrayAdapter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SecondHigestNumber {
    int a[]={10,1,8,6,7,11,9};

    /*worst solution

   */
//    int arr[]={3,4,5,9,1,11,6,2};
//    int max=arr[0];
//    int temp;
//    int position;
//    public void getMaxNumber(){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//                position=i;
//            }
//        }
////        System.out.println(max);
//        temp=max;
//        max=arr[0];
//        arr[position]=Integer.MIN_VALUE;
//
//
//            for(int j=0;j<arr.length;j++){
//                if(arr[j]>max){
//                    max=arr[j];
//                }
//            }
//            arr[position]=temp;
//
//        System.out.println("second higest"+max);
//        System.out.println("second higest"+Arrays.toString(arr));
//
//    }

     /* Average Solution sorting using Arrays utility class

      */


     public void sortArray(){
         Arrays.sort(a);
         int secondHigestNo=a[a.length-2];
         System.out.println(secondHigestNo);

     }





    /*best solution */
//    public int getSecondmax(){
//        if(a.length>=2){
//            int first=a[0];
//            int second=a[1];
//            if(a[0]>a[1]){
//                first=a[0];
//                second=a[1];
//            }
//            else{
//                first=a[1];
//                second=a[0];
//            }
//            for(int i=2;i<a.length;i++){
//                if(a[i]>second){
//                    second=a[i];
//                    if(a[i]>first){
//                        second=first;
//                        first=a[i];
//                    }
//                }
//            }
//            return second;
//        }else{
//            return -1;
//        }
//
//
//    }



}
class test{
    public static void main(String[] args) {
        SecondHigestNumber secondHigestNumber=new SecondHigestNumber();
        secondHigestNumber.sortArray();


        /*best solution

        */

//       int secondMax=secondHigestNumber.getSecondmax();
//       if(secondMax>0){
//           System.out.println("second maxium value is"+secondMax);
//       }else{
//           System.out.println("minium 2 element should be there in list");
//       }



    }

    /*public static List<Long> waysToChooseSum(long a, long b) {
        // Write your code here
        HashMap<Long, Long> chooseMap = new HashMap<>();
        for(Long i =a; i<=b; i++){
            Long sum = NumberSum(i);
            if(chooseMap.containsKey(i)){
                chooseMap.put(i, chooseMap.get(i));
            }else{
                chooseMap.put(i, 1L);
            }
        }
    }

    public static long NumberSum(long num){
        if(num/10 ==0){
            return num;
        }
        return (num % 10) + NumberSum(num/10);
    }*/
}
