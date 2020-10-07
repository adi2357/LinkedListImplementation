package com.bridgelabz.linkedlistimplementation;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class MyLinkedListTest {

	@Test
	public void given3NumberWhenLinkedShouldPassLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode(56);
		MyNode<Integer> secondNode = new MyNode(30);
		MyNode<Integer> thirdNode = new MyNode(70);

		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);

		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAddedToLinkedShouldBeAddedToTop() {
		MyNode<Integer> firstNode = new MyNode(70);
		MyNode<Integer> secondNode = new MyNode(30);
		MyNode<Integer> thirdNode = new MyNode(56);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		
		myLinkedList.printMyList();
		boolean result = myLinkedList.getHead().equals(thirdNode) && myLinkedList.getHead().getNext().equals(secondNode)
				&& myLinkedList.getTail().equals(firstNode);
		Assert.assertTrue(result);
	}

}
