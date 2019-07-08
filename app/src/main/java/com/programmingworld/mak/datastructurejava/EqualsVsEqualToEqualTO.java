package com.programmingworld.mak.datastructurejava;

public class EqualsVsEqualToEqualTO {
    int i=10;


}
 class Subclass extends EqualsVsEqualToEqualTO{
    int i=20;

     public static void main(String[] args) {
         /*EqualsVsEqualToEqualTO equalsVsEqualToEqualTO=new EqualsVsEqualToEqualTO();
         System.out.println("super class value"+equalsVsEqualToEqualTO.i);

         Subclass subclass=new Subclass();
         System.out.println("sub class value"+subclass.i);*/

         EqualsVsEqualToEqualTO equalsVsEqualToEqualToo=new Subclass();
         //equalsVsEqualToEqualToo.i=50;
         System.out.println("super class value 3rd"+equalsVsEqualToEqualToo.i);

     }

}
