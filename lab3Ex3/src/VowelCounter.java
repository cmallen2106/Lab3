//Lab 3 - Exercise 3
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Scanner; 
import java.lang.String; 

public class VowelCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int countA = 0; 
		int countE = 0; 
		int countI = 0; 
		int countO = 0; 
		int countU = 0; 
		int nonVowel = 0;  
		
		//ask user for a string
		System.out.println("Please enter any word or sentence: "); 
		String line = scan.nextLine(); 
		
		line = line.toLowerCase();
		
		//scan string for vowels and non-vowels
		for (int index = 0; index < line.length(); index++) {
			
			char userChar = line.charAt(index); 
			if (userChar == 'a') {
				countA++; 
			}
			else if (userChar == 'e') {
				countE++; 
			}
			else if (userChar == 'i') {
				countI++; 
			}
			else if (userChar == 'o') {
				countO++; 
			}
			else if (userChar == 'u') {
				countU++; 
			}
			else if ((userChar >= 'a' && userChar <= 'z')) {
				nonVowel++; 
			}
			
			
		}
		
		//print out number of vowels and non-vowels
		System.out.println("There are " + countA + " lowercase a characters.");
		System.out.println("There are " + countE + " lowercase e characters.");
		System.out.println("There are " + countI + " lowercase i characters.");
		System.out.println("There are " + countO + " lowercase o characters.");
		System.out.println("There are " + countU + " lowercase u characters.");
		System.out.println("There are " + nonVowel + " non-vowel characters.");
		
		//close scanner
		scan.close();
	}

}
