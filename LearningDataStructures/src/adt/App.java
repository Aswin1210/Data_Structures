package adt;

public class App {

	public static void main(String[] args) {
		Counter mycounter = new Counter("Aswin");
		
		mycounter.increment();
		mycounter.increment();
		mycounter.increment();
		mycounter.increment();
		mycounter.increment();
		
		System.out.println(mycounter.tostring());
		

	}

}
