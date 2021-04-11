package com.simpleLinkedList;

 public interface INode<T> {
    T getData();
    void setData(T key);

    INode getNext();
    void setNext(INode next);

}
