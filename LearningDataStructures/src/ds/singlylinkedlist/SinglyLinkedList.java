package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}

	public void insertfirst(int data) {
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=first;
		first = newNode;
	}
	
	public Node deletefirst() {
		Node temp =first;
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
	
	public void insertlast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode =new Node();
		newNode.data = data;
		current.next = newNode;
		
	}
}
