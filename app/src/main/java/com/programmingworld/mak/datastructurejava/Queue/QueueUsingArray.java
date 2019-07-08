package com.programmingworld.mak.datastructurejava.Queue;

public class QueueUsingArray {
    public static void main(String[] args) {
      QueueUsingArray queueUsingArray=new QueueUsingArray();
        queueUsingArray.enqueue(10);
        //queueUsingArray.enqueue(2);
        //queueUsingArray.enqueue(3);
        //queueUsingArray.enqueue(4);

        queueUsingArray.dequeue();
        queueUsingArray.getFront();

        //queueUsingArray.dequeue();






        //queueUsingArray.getFront();
        //queueUsingArray.getRear();


    }

    int arr[]=new int[9];
    int front=-1;
    int rear=-1;
    public void enqueue(int value){
        rear++;
        if(rear==arr.length){
            System.out.println("arry is full");
        }else{
            arr[rear]=value;
        }


    }
    public void dequeue()
    {
        if(front==rear){
            System.out.println("array is empty");
        }else{
            arr[front]=0;
            front++;
        }


    }
    public int getRear(){
        System.out.println(arr[rear]);
       return rear;
    }
    public int getFront(){
        System.out.println(arr[front]);

        return front;
    }
}
