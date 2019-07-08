package com.programmingworld.mak.datastructurejava.Queue;

public class QueueUsingLinkedList {

    public static void main(String[] args) {
        QueueUsingLinkedList queue=new QueueUsingLinkedList();
        queue.insertItemInQueue(15);
//        queue.insertItemInQueue(2);
//        queue.insertItemInQueue(30);
//        queue.insertItemInQueue(4);
//        queue.insertItemInQueue(10);
//        queue.printQueue();
//        System.out.println("Deque-------");
//        queue.deque();
//        System.out.println("rear-------");
//        queue.getRear();

    }

    Node front;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void insertItemInQueue(int val){
        Node node = new Node(val);
        if(front == null){
            //front = new Node(val);
            // or we can write it like this as well
            front = node;
            return;
        }
        node.next = null;
        Node lastItem = front;
        while(lastItem.next != null){
            lastItem = lastItem.next;
        }
        lastItem.next = node;
        return;
    }

    private Node deque(){
        if(front != null){
            Node currentNode = front;
            Node node = front.next;
            front = node;
            System.out.println(currentNode.value);
            return currentNode;
        }
        return null;
    }

    private Node getRear(){
        if(front != null){
            Node lastNode = front;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            System.out.println(lastNode.value);
            return lastNode;
        }
        return null;
    }

    private void printQueue(){
        if(front != null) {
            Node currentItem = front;
            while (currentItem != null) {
                System.out.println(currentItem.value);
                currentItem = currentItem.next;
            }
        }
    }



}
