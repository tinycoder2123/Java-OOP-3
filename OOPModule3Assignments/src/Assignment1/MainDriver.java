/***************************************************************
 * OOP Module 3 Arrays
 * Assignment 1 Driver
 * By Karolina Szulczyk
 ****************************************************************/

package Assignment1;

import java.util.Scanner;

public class MainDriver 
{
	public static void main(String[] args) 
	{
		 Scanner stdIn = new Scanner(System.in);
	       VowelCounter vowel = new VowelCounter();
	       while (true)
	       {
	           System.out.print("Enter a line of characters (press enter by itself to quit): ");
	           String sentence = stdIn.nextLine();
	           if (sentence.length() == 0)
	               break;
	           vowel.processLine(sentence);
	       }
	       vowel.printSummary();
	   }
	}