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

	

}
