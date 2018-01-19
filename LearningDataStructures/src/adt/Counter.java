package adt;

public class Counter {
	String name = null;
	int count = 0;
	
	public Counter(String str){
		this.name = str;	
	}
	public void increment() {
		count = count+1;
		System.out.println("Incremented Value: "+count);
	}
	public int getcurrentalue() {
		System.out.println("Current Value: "+ count);
		return count;
	}
	public String tostring() {
		return name + ": " + count;
	}
}
