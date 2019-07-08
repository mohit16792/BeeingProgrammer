package com.programmingworld.mak.datastructurejava.Array;

public class Search {
    int listOfNo []={10,80,20, 90,30,40,50,67};
    //search the position of 90
    public int getPosition()
    {
        for(int i=0;i<listOfNo.length;i++)
        {
            if(listOfNo[i]==90)
            {
                return i;
            }
        }
        return -1;

    }

}

class TestSearch{
    public static void main(String[] args) {
        int position;
        Search search=new Search();
        position= search.getPosition();
        System.out.println("positon of element in array is"+position);
        //time complexity of this program is O(n)
    }
}
