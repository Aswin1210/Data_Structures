package ds.singlylinkedlist;

public class App {
public static void main(String[] args) {
	SinglyLinkedList mylist = new SinglyLinkedList();
	mylist.insertfirst(1);
	mylist.insertfirst(2); 
	mylist.insertfirst(3); 
	mylist.insertfirst(4); 
	mylist.insertlast(5);
	
	mylist.displayList();
}
}
