package com.programmingworld.mak.datastructurejava;

import java.util.Random;
import java.util.TreeMap;

public class HomeCreadit {
    public static void main(String[] args) {

        HomeCreaditTest homeCreaditTest = new HomeCreaditTest();
        homeCreaditTest.getstatus();
    }
}
class HomeCreaditTest {

    public void getstatus() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        String name[] = {"Harry", "Ada", "Elon", "Jane"};
        String surname[] = {"Lovelace", "Doe", "Potter", "Musk"};

        for (int i = 1; i <= 90; i++) {
            treeMap.put(i, i + "-" + name[getRandomNumber()] + " " + surname[getRandomNumber()]);


            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(treeMap.get(i) + " -Loan Pending");
            } else if (i % 3 == 0) {
                System.out.println(treeMap.get(i) + " -Loan");
            } else if (i % 5 == 0) {
                System.out.println(treeMap.get(i) + " -Pending");
            } else {
                System.out.println(treeMap.get(i) + " -No Data");
            }

        }
        System.out.println("\n List Of All Famous Programmers who must get Loan");
        for (int i = 1; i <= 90; i++) {

            if (i % 3 == 0 &!(i%5==0)) {
                System.out.println(treeMap.get(i) + " -Loan");
            }
        }
    }
    //generating random no between 0-3
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4);
    }
}
