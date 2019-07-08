package com.programmingworld.mak.datastructurejava.Recursion;

public class Factorial {

    public int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
class FactorialTest{
    public static void main(String[] args) {
        int factResult;
        Factorial factorial=new Factorial();
        factResult= factorial.fact(3);
        System.out.println(factResult);
    }
}

