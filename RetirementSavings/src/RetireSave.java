/************************************************************/
/* Author: Akil Lewis                                       */
/* Major: Information Technology                            */
/* Creation Date: September 16, 2018                        */
/* Due Date: September 18, 2018                             */
/* Course: CSC243 010                                       */
/* Professor Name: Professor Demarco                        */
/* Assignment: Project 1                                    */
/* Filename: RetireSave.java                                */
/* Purpose: This program will ask the user for number of    */
/* years they have to retire and how much money they want to*/
/* save for retirement then put into a formula where the    */
/* interest rate is added into to display the amount of $   */
/* the user will have for their retirement                  */
/************************************************************/

//Reads input from the user
import java.util.Scanner;

public class RetireSave {

private static Scanner sc;

public static void main(String args[])

{
//allows me to ask user for input 
sc = new Scanner(System.in);

//initalizing my variables noy = number of years and savings is double
int noy;
double savings;

//Prints out the question for the user to respond to
System.out.println("How many years do you have until you retire?");

noy=sc.nextInt();

//loop for question to be asked in case invalid characters are repeatedly inserted
while(noy<=0)
{
		System.out.println("Please enter a valid number");
		noy=sc.nextInt();
}

System.out.println("\n");
//Prints out the question for the user to respond to
System.out.println("Submit the amount of money you plan to save annually");

savings=sc.nextDouble();
//loop for question to be asked in case invalid characters are repeatedly inserted
while(savings<=0)
{
	System.out.println("Please enter a valid number");
	savings=sc.nextDouble();
}
System.out.println("\n");

//5% interest rate
//Displays amount of money for retirement by computing the formula 
System.out.println("The amount you get after retirement is:"+ "$" +(savings*noy*(.05))+ "0");

}

}