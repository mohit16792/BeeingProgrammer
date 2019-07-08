package com.programmingworld.mak.datastructurejava.Array;

import java.util.Arrays;

public class Delete {
    //delete 20 from array
    int arr[]={10,20,30,40,50,60};
    int position;
    //serach index of 20
    public int getPositon()
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==20)
            {
                position=i;
                return i;
            }
        }
        return -1;
    }
    public void deleteElement()
    {
        if(position>0)
        {
            for(int i=position;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            for(int i:arr){
                System.out.println("array elements"+" "+i);
            }
            //simplest way to print array
            System.out.println(Arrays.toString(arr));

        }
    }


}
class DeleteTest{
    public static void main(String[] args) {

        Delete delete=new Delete();
        //time complexcity O(n)
        delete.getPositon();
        //time complexcity O(n)
        delete.deleteElement();
        //total time comlexcity=O(n)+O(n)=O(2n) means O(n)


    }

}


