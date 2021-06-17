/***************************************************************
 * OOP Module 3 Arrays
 * Assignment 1 Vowel Counter
 * By Karolina Szulczyk
 ****************************************************************/

package Assignment1;

public class VowelCounter 
{
	 int[][] count;
	   public VowelCounter()
	   {
	       count = new int[2][5];
	   }
	   public void processLine(String something)
	   {
	       for (int i = 0; i < something.length(); i++)
	       {
	           if (something.charAt(i) == 'a')
	               count[0][0] += 1;
	           else if (something.charAt(i) == 'e')
	               count[0][1] += 1;
	           else if (something.charAt(i) == 'i')
	               count[0][2] += 1;
	           else if (something.charAt(i) == 'o')
	               count[0][3] += 1;
	           else if (something.charAt(i) == 'u')
	               count[0][4] += 1;
	           else if (something.charAt(i) == 'A')
	               count[1][0] += 1;
	           else if (something.charAt(i) == 'E')
	               count[1][1] += 1;
	           else if (something.charAt(i) == 'I')
	               count[1][2] += 1;
	           else if (something.charAt(i) == 'O')
	               count[1][3] += 1;
	           else if (something.charAt(i) == 'U')
	               count[1][4] += 1;
	       }
	   }
	   public void printSummary()
	   {
	       System.out.println("A : "+count[0][0]+" lowercase, "+count[1][0]+" uppercase, "+(count[0][0] + count[1][0])+" total");
	       System.out.println("E : "+count[0][1]+" lowercase, "+count[1][1]+" uppercase, "+(count[0][1] + count[1][1])+" total");
	       System.out.println("I : "+count[0][2]+" lowercase, "+count[1][2]+" uppercase, "+(count[0][2] + count[1][2])+" total");
	       System.out.println("O : "+count[0][3]+" lowercase, "+count[1][3]+" uppercase, "+(count[0][3] + count[1][3])+" total");
	       System.out.println("U : "+count[0][4]+" lowercase, "+count[1][4]+" uppercase, "+(count[0][4] + count[1][4])+" total");
	   }
}
