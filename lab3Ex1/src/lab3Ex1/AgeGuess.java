//Lab 3 - Exercise 1
//Christina Sosa
//Programming Fundamentals, Summer 2021
package lab3Ex1;

import java.util.Scanner;
import java.util.Random;

public class AgeGuess {
	public static void main(String[]args) {
		
		Random randNum = new Random();
		
		//Declare a new int variable age &
		//Initialize age to a random integer between 0 and 100 (inclusive)
		int age = randNum.nextInt(100); 
		
		try (Scanner scan = new Scanner (System.in)) {
			int ageGuess; 
			
			//Asks the user for a guess, save the guess into the ageGuess variable
			System.out.println("Guess my age:"); 
			ageGuess = scan.nextInt(); 
			
			while (ageGuess != age) {
				
				System.out.println("You guessed incorrectly! Please guess again: "); 
				ageGuess = scan.nextInt(); 
			}
			
			if (ageGuess == age) {
				System.out.println("You guessed correctly! I am " + age + " years old."); 
			}
			
			scan.close(); 
		}
		
	}
}