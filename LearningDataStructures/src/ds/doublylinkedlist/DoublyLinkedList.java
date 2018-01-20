package ds.doublylinkedlist;



public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return(first == null);
	}
	
	public void insertfirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode; //if empty, last will refer to the new node being created
		}else {
			first.previous = newNode;
		}
		newNode.next = first; //new node's next field will point to the old first
		this.first = newNode;
	}
	
	public void insertlast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode; //assigning old last to new node
			newNode.previous=last; //old last will be new node's previous
		}
		last = newNode; //linkedlist's last field should point to new node	
	}
	
	//assume non-empty list
	public Node deletefirst() {
		Node temp = first;
		if (first.next == null) { //There is only one item in the list
			last = null;
		}else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	
	public Node deletelast() {
		Node temp = last;
		if (first.next == null) {//we only have one node in list
			first = null;
		}else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	public boolean insertAfter (int key, int data) {
		Node current = first; //we start from the beginning of the list
		while (current.data != key) { //as long as we have not found the key in a particular node
			current = current.next;
			if(current == null) {
				return false;
			}
			
		}
		Node newNode = new Node();
		newNode.data=data;
		
		if(current == last) {
			current.next = null;
			last = newNode;
		}else {
			newNode.next = current.next; //new node's next field should point to the node ahead of the current node
			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	public Node deleteKey (int key) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
			
			if (current == first) {
				first = current.next;
			}else{
				current.previous.next = current.next;
			}
			
			if (current == last) {
				last = current.previous;
			}else {
				current.next.previous = current.previous;
			}
			return current;
			}
		

	public void displayForward() {
		System.out.println("List -> Start... -> Last");
		Node current = first;
		while (current != null) {
			current.displaydata();
			current= current.next;
		}
	}
	
	public void displayBackward() {
		System.out.println("List -> Last... -> Start");
		Node current = last;
		while (current != null) {
			current.displaydata();
			current= current.previous;
		}
	}



}
