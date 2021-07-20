//Lab 3 - Exercise 2
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab3Ex2;
import java.util.Scanner; 

public class EvenNumSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in); 
		
		//reads an integer value
		int userInt; 
		
		System.out.println("Please enter an integer greater than 2: "); 
		userInt = scan.nextInt();
		
		//reads an integer value and prints the sum of all even integers between 2 and the input value, inclusive
		if (userInt >=2) {
			int sum = 0; 
			for (int even = 2; even <= userInt; even += 2) {
				sum += even; 
			}
			System.out.println("The sum of all even numbers between 2 and your input: " + sum); 
		}
		
		//if input integer is less than 2
		while (userInt < 2) {
			System.out.println("Value must be greater than 2. Please enter a new number: "); 
			userInt = scan.nextInt(); 
		}
		
		//close scanner
		scan.close(); 
		
	}

}
