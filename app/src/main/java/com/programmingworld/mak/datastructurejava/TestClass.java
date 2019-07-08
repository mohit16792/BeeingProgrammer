package com.programmingworld.mak.datastructurejava;

import java.io.Serializable;
import java.util.Stack;

public class TestClass {


    public static void main(String[] args) {
      int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      int sum=0;
      int row = a.length;
      int column = a[0].length;
      for(int i=0;i<row-1;i++){
          for(int j=i;j<column-1;j++){
              sum+=a[i][j+1];

          }
      }
        System.out.println(sum);




    }


}


