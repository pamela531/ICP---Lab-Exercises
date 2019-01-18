package LabAssignment;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Pamela Quartson and Lenry Neequaye
 *
 */
public class labOne {


	public static void main(String[] args) {
		
	//Question 1
		System.out.println("Enter string to find its length: ");
		Scanner word = new Scanner(System.in); // This 
		String input = word.nextLine();		// This line enables the user to input a string
		int strLength = input.length();		// this is to find the length of the string word input by the user
		System.out.println("The length of the word is "+strLength);
		
	//Question 2
		System.out.println("Enter the statement to be reversed: ");
		String str = word.nextLine();		//This line enables the programme to take a string input from the user
		String newWord = "";
		String Word = "";
		for(int i = str.length()-1;i>=0;i--) {
			newWord = newWord+str.charAt(i);	//In this loop, the given string is reversed from th elast word to the first
		}
		
		String [] spword = newWord.split(" ");		//this splits the string up where there are spaces and appends the results to a string array called spword
		for(int i  = spword.length-1; i >=0;i--) {
			Word = Word+spword[i]+" ";		//in this loop, the order of the items in the array spword is reversed
		}		
		System.out.println(Word);
		
	//Question 3
		System.out.println("Enter the radius of the circle: ");
		double radius = word.nextDouble();		//this line takes a double input from the user
		double area = Math.PI*Math.pow(radius, 2);
		double circ = 2*Math.PI*radius;
		System.out.printf("Area = %.2f \nCircumference = %.2f",area,circ); //this rounds the area and circumference values to two decimal places and prints them out


	}
}