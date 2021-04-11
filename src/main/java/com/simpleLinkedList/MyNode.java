package com.simpleLinkedList;
public class MyNodeTest<T> implements INode<T> {
        private T head;
        private MyNodeTest next;

    public MyNodeTest(T key) {
            this.head = null;
            this.next = null;
        }

        public MyNodeTest getNext () {
            return next;
        }

        public void setNext (MyNodeTest next){
            this.next = next;
        }
        
}

