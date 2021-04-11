package com.simpleLinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LinkedListsTest {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNodeTest<Integer> myFirstNode = new MyNodeTest<>(56);
        MyNodeTest<Integer> mySecondNode = new MyNodeTest<>(30);
        MyNodeTest<Integer> myThirdNode = new MyNodeTest<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);

    }

}

