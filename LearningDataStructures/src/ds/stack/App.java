package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack TheStack = new Stack(5);
		TheStack.push('h');
		TheStack.push('e');
		TheStack.push('l');
		TheStack.push('l');
		TheStack.push('o');
		
		while(!TheStack.isEmpty()) {
			char value = TheStack.pop();
			System.out.println(value);
		}
			
		
		
		

	}

}
