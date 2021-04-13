package com.simpleLinkedList;
public class MyLinkedList<T> {
    public INode head;
    public INode tail;


    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }


    public void append(INode newNode) {
        if (tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getData());
            if (!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getData());
        System.out.println(myNodes);
    }

    public void insert(INode node, INode newNode) {
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public boolean searchKey(T data) {
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getNext().getData().equals(data)) {
                return true;
            }
        }
        return false;
    }

    public void searchInsert(T data, INode newNode) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getData().equals(data)) {
                INode temp = tempNode.getNext();
                tempNode.setNext(newNode);
                newNode.setNext(temp);
            }
                tempNode = tempNode.getNext();
        }
    }
}
