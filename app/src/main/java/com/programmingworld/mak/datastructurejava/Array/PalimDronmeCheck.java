package com.programmingworld.mak.datastructurejava.Array;

import java.util.Arrays;

public class PalimDronmeCheck {

    public static void main(String[] args) {
        System.out.println(PalimDronmeCheck.isPalimDrone("radar"));
    }

    public static boolean isPalimDrone(String name){
        boolean isPalimdrone=false;
        String[] array=name.split( "" );
        System.out.println(Arrays.toString(array));
        int length=array.length-1;
        for(int i=0;i<array.length/2;i++){
            if(array[i].equals(array[length-i])){

               isPalimdrone= true;
            }else{
                isPalimdrone=false;
            }

        }
        return isPalimdrone;
    }
}

