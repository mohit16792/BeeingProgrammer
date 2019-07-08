package com.programmingworld.mak.datastructurejava.LinkList;

public class LinkListAllOperations {
    Node head;

    class Node {
        int value;
        Node nextAddress;

        Node(int value) {
            this.value = value;
        }
    }

    public void insertElement(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.nextAddress != null) {
                tempNode = tempNode.nextAddress;
            }
            tempNode.nextAddress = node;
        }
    }

    public void insertByIndex(int newElement, int index) {
        if(index>=getSize()){
            System.out.println("index is greater than the size of list");
            return;
        }
        Node tempNode = head;
        Node newNode = new Node(newElement);
        if (index > 0) {
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.nextAddress;
            }
            newNode.nextAddress = tempNode.nextAddress;
            tempNode.nextAddress = newNode;
        } else {
            newNode.nextAddress = head;
            head = newNode;
        }


    }

    public void insertRight(int listElement, int newElement) {
        if (getIndex(listElement) == -1) {
            System.out.println("there is no element found which you want to add after(Right)");
        } else {
            int index = getIndex(listElement);
            insertByIndex(newElement, index + 1);
        }
    }

    public void insertLeft(int listElement, int newElement) {
        if (getIndex(listElement) == -1) {
            System.out.println("there is no element found which you want to add before(Right)");
        } else {
            int index = getIndex(listElement);
            insertByIndex(newElement, index);
        }
    }

    public void deleteByNo(int value) {
        boolean isElementThere = false;
        if (head == null) {
            System.out.println("List is Empty");
        } else if (head != null && head.value == value) { //if element to be deleted from 0 index
            head = head.nextAddress;
        } else {
            Node tempNode = head;
            while (tempNode.nextAddress != null) {
                if (tempNode.nextAddress.value == value) {
                    tempNode.nextAddress = tempNode.nextAddress.nextAddress;
                    isElementThere = true;
                } else {
                    tempNode = tempNode.nextAddress;
                }
            }
            if (!isElementThere) {
                System.out.println("The element you are trying to delete is not in the list");
            }
        }
    }

    public void deleteByIndex(int index) {
        if(index>=getSize()){
            System.out.println("index is greater than the size of list");
            return;
        }
        Node tempNode = head;
        Node deleteNode=null;
        if(index>0){
            for (int i = 0; i < index-1; i++) {
                tempNode = tempNode.nextAddress;
            }
            deleteNode=tempNode.nextAddress.nextAddress;
            tempNode.nextAddress=deleteNode;
        }else{
            head=head.nextAddress;
        }


    }


    public void deleteLeft(int listElement){
        if(getIndex(listElement)==-1){
            System.out.println("what the Hell");
            return;
        }else if(getIndex(listElement)==0){
            System.out.println("no element is left of element you entered");
            return;
        }else {
            int index=getIndex(listElement);
            deleteByIndex(index-1);
        }

    }
    public void deleteRight(int listElement){
        if(getIndex(listElement)==-1){
            System.out.println("what the Hell");
            return;
        }else if(getIndex(listElement)==getSize()-1){
            System.out.println("no element is right of element you entered");
        }else{
            int index=getIndex(listElement);
            deleteByIndex(index+1);
        }



    }


    public int getIndex(int value) {
        Node tempNode = head;
        int counter = 0;
        boolean isElementThere = true;
        if (head == null) {
            System.out.println("lis is empty");
        } else {
            while (tempNode != null) {
                if (tempNode.value == value) {
                    isElementThere = false;
                    return counter;
                } else {
                    tempNode = tempNode.nextAddress;
                    counter++;
                }

            }
            if (isElementThere) {
                return -1;
            }
        }
        return counter;
    }

    public int getSize() {
        Node tempNode = head;
        int counter = 0;
        if (head == null) {
            return counter;
        } else {
            while (tempNode != null) {
                counter++;
                tempNode = tempNode.nextAddress;
            }
        }
        return counter;
    }

    public void printElements(Node head) {
        if (head != null) {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.println(tempNode.value);
                tempNode = tempNode.nextAddress;
            }
        }
    }

    public Node reverse(Node head){
        if(head==null || head.nextAddress==null){
            return head;
        }
       // \u000d System.out.println("before"+head.value);

        Node temp=reverse(head.nextAddress);
        System.out.println("after"+head.value);
        head.nextAddress.nextAddress=head;
        head.nextAddress=null;
        return temp;
    }

}

class LinkListTester {
    public static void main(String[] args) {
        LinkListAllOperations linkListAllOperations = new LinkListAllOperations();
        linkListAllOperations.insertElement(1);
        linkListAllOperations.insertElement(2);
        linkListAllOperations.insertElement(3);
        linkListAllOperations.insertElement(4);
//          linkListAllOperations.insertByIndex(20,12);
//        linkListAllOperations.insertRight(7, 8);
//        linkListAllOperations.insertLeft(10, 2);
//        linkListAllOperations.deleteByIndex(0);
        //linkListAllOperations.deleteRight(5);

//        int size=linkListAllOperations.getSize();
//        System.out.println(size);
//        System.out.println("index of "+linkListAllOperations.getIndex(7));
//        linkListAllOperations.deleteByNo(5);
        LinkListAllOperations.Node reverseList= linkListAllOperations.reverse(linkListAllOperations.head);
        linkListAllOperations.printElements(reverseList);
    }
}
