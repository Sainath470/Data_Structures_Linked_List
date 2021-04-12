package com.simpleLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListsTest {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenAddedToLinkedListTestShouldBeAddedToTop(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListTestShouldBeAddedToLast(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                        myLinkedList.head.getNext().equals(mySecondNode) &&
                        myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenOneNumberIsAddedToLinkedListTestShouldBeAddedInMiddle(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode,secondNode);
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenFirstNumberInTheLinkedListTestShouldBeRemoved(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode,secondNode);
        linkedList.pop();
        linkedList.printMyNodes();
        boolean result = linkedList.head.equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenLastNumberInTheLinkedListTestShouldBeRemoved(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode,secondNode);
        linkedList.popLast();
        boolean result = linkedList.head.equals(firstNode) &&
                linkedList.tail.equals(secondNode);
        Assertions.assertTrue(result);
        linkedList.printMyNodes();
    }

    @Test
    public void Given3Numbers_WhenSearch_ParticularNumber_ResultReturned(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.searchKey(30);
        boolean result = linkedList.searchKey(30);
        Assertions.assertTrue(result);
    }

}

