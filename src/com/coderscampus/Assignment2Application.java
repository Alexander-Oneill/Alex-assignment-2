package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {


	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in); 
				
		int randomNumber = random.nextInt(100) + 1;
		int numberOfTries = 5;
		boolean hasGuessCorrectly = false;
		
		for (int i = 0; i < numberOfTries; i++) {
            System.out.print("pick a number between 1 - 100 ");
            int userInput = scanner.nextInt();
            if(userInput < 1 || userInput > 100) {
            	System.out.println("Your guess is not between 1 and 100, please try again");
            	continue;
            }
            if(userInput == randomNumber){
            	hasGuessCorrectly = true;
            	break;
            }else if(userInput < randomNumber) {
				System.out.println("please pick a higher number");
			}else{
				System.out.println("Please pick a lower number:");
			}
		
		
		}
		
		if(hasGuessCorrectly) {
			System.out.println("You win!");
		}else {
			System.out.println("sorry you lose!, the right number was: " + randomNumber);
		}

		
	
		scanner.close();
		

	}
}