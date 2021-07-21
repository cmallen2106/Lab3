//Lab 3 - Exercise 4
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab3Ex4;

public class Box {
	
	int size = 0; 

	public static void main(String[] args) {
		Box box = new Box(); 
		box.setSize(); 
		box.printBox(); 
		 

	}
	
	//method to set size of printBox method
	public void setSize() {
		size = 5; 
	}
	
	//Add a method to this class named printBox with no parameters and void return type, that
	//prints out to the screen a set of * (star) characters with size rows and size columns.
	
	public void printBox() {
		for (int num = 1; num <= size; num++) {
			for (int index = 1; index <= size; index++)
				System.out.println("*"); 
			System.out.println(); 
		}
	}
	
		 

}
