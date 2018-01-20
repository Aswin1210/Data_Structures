package ds.circularLinkedList;

public class App {
	public static void main (String [] args) {
		Circularlinkedlist mylist = new Circularlinkedlist();
		mylist.insertfirst(1);
		mylist.insertfirst(2); 
		mylist.insertfirst(3); 
		mylist.insertfirst(4); 
		mylist.insertlast(5);
		
		mylist.displayList();
	}

}
