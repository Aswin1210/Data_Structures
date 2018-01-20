package ds.circularLinkedList;

import ds.circularLinkedList.Node;

public class Circularlinkedlist {
	private Node first;
	private Node last;
	
	public Circularlinkedlist() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertfirst(int data) {
		Node newNode = new Node();
		newNode.data=data;
		if (isEmpty()) {
			last = newNode;
		}
		newNode.next=first; //new node is being assigned old first
		first = newNode; //first node
	}
	
	public void insertlast(int data) {
		Node newNode =new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		}else
		{
			last.next = newNode;//next value of the last node will point to the new node
			last = newNode; //we make the new node created be the last one in the list
		}
	}
	
	public int deletefirst() {
		int temp = first.data;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
		
	}
	public void displayList() {
		System.out.println("List -> Single... -> Last");
		Node current = first;
		while (current != null) {
			current.displaydata();
			current= current.next;
		}
	}
}
