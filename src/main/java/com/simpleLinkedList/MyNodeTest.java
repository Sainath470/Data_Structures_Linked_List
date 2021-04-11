package com.simpleLinkedList;
public class MyNodeTest<T> {
        private T key;
        private MyNodeTest next;

    public MyNodeTest(T key) {
            this.key = null;
            this.next = null;
        }

        public MyNodeTest getNext () {
            return next;
        }

        public void setNext (MyNodeTest next){
            this.next = next;
        }
}

