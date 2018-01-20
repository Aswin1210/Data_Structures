package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList mylist = new DoublyLinkedList();
		mylist.insertfirst(1);
		mylist.insertfirst(2);
		mylist.insertfirst(3);
		mylist.insertlast(4);
		mylist.insertlast(5);
		mylist.insertlast(6);
		mylist.displayForward();
		mylist.displayBackward();
		mylist.deletefirst();
		mylist.deletelast();
		mylist.deleteKey(6);
		mylist.displayForward();
		mylist.displayBackward();
		mylist.insertAfter(5, 7);
		mylist.insertAfter(3, 8);
		mylist.displayForward();
		mylist.displayBackward();
		
		
	}

}
