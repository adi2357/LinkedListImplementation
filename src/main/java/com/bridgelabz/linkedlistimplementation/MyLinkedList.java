package com.bridgelabz.linkedlistimplementation;

public class MyLinkedList<K> {
	private AllNode head;
	private AllNode tail;
	private static AllNode tempNode;

	public AllNode getHead() {
		return head;
	}

	public AllNode getTail() {
		return tail;
	}

	public static AllNode getTempNode() {
		return tempNode;
	}

	public MyLinkedList() {
		this.head = head;
		this.tail = tail;
	}

	public void add(AllNode newNode) {
		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else {
			tempNode = this.head;
			this.head = newNode;
			newNode.setNext(tempNode);
		}
	}

	public void append(AllNode newNode) {
		if (head == null)
			this.head = newNode;
		if (tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void printMyList() {
		System.out.print("My List is : ");
		StringBuffer myList = new StringBuffer();
		AllNode tempNode = head;
		while (tempNode.getNext() != null) {
			myList.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myList.append("->");
			tempNode = tempNode.getNext();
		}
		myList.append(tempNode.getKey());
		System.out.println(myList);
	}

	public void insert(AllNode myNode, AllNode newNode) {
		AllNode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public AllNode deleteFirst() {
		AllNode tempNode = this.head;
		this.head = head.getNext();
		System.out.println("Deleted element is :" + tempNode.getKey());
		return tempNode;
	}
}
