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
			this.tail=newNode;			
		}
	}
	
	
	public void printMyList() {
		System.out.println("My List is :");
		StringBuffer myNodes = new StringBuffer();
		tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
