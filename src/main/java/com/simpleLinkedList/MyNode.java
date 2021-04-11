package com.simpleLinkedList;
public class MyNode<T> implements INode<T> {
    private T data;
    private INode next;

    //constructor
    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T key) {
        this.data = key;
    }


    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

}

