package LinkList;

public class App {

	public static void main(String[] args) {
		node NodeA = new node();
		NodeA.data=4;
		
		node NodeB = new node();
		NodeB.data=3;
	
		node NodeC = new node();
		NodeC.data=7;
		
		node NodeD = new node();
		NodeD.data=8;
		
		NodeA.next = NodeB;
		NodeB.next=NodeC;
		NodeC.next=NodeD;
		System.out.println(listlength(NodeD));

	}
	public static int listlength(node NodeA) {
	
		int length =0;
		while (NodeA!=null) {
			NodeA = NodeA.next;
			length ++;
		}
		return length;
	}

}
