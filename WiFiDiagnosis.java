/*
 * Class: CMSC203 
 * Instructor:
 * Description: Build an application that will step through some possible problems to restore internet connectivity.  Assume that your computer uses wi-fi to connect to a router which connects to an Internet Service Provider (ISP) which connects to the Internet.
 * Due: 2/09/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: HUYNH MINH QUAN NGO
*/

import java.util.Scanner;
public class WiFiDiagnosis {
	
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	//Print Header
	System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
	
	//Step One
	System.out.println("First step: reboot your computer");
	System.out.print("Are you able to connect with the internet? (yes or no): ");
	String choice = sc.nextLine().trim();
	
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
		System.out.println("You can only enter yes or no, please retry!\n");
		System.out.print("Are you able to connect with the internet? (yes or no): ");
		choice = sc.nextLine().trim();
		}
	
	if(choice.equalsIgnoreCase("yes")) {
	System.out.println("\nRebooting your computer seemed to work");
	return;
	}
	
	//Step Two
	System.out.println("\nSecond step: reboot your router");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = sc.nextLine().trim();
	
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
		System.out.println("You can only enter yes or no, please retry!\n");
		System.out.print("Now are you able to connect with the internet? (yes or no): ");
		choice = sc.nextLine().trim();
		}
	
	if(choice.equalsIgnoreCase("yes")) {
	System.out.println("\nRebooting your router seemed to work");
	return;
	}
	
	//Step Three
	System.out.println("\nThird step: make sure the cables to your router are plugged in firmly and your router is getting power");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = sc.nextLine().trim();
	
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
	System.out.println("You can only enter yes or no, please retry!\n");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = sc.nextLine().trim();
	}
	
	if(choice.equalsIgnoreCase("yes")) {
	System.out.println("\nChecking the router's cables seemed to work");
	return;
	}
	
	//Step Fourth
	System.out.println("\nFourth step: move your computer closer to your router");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = sc.nextLine().trim();
	
	while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
	System.out.println("You can only enter yes or no, please retry\n");
	System.out.print("Now are you able to connect with the internet? (yes or no): ");
	choice = sc.nextLine().trim();
	}
	
	if(choice.equalsIgnoreCase("yes")) {
	System.out.println("\nMoving your computer closer to the router seemed to work");
	return;
	}
	
	//Step Five
	System.out.println("\nFifth step: contact your ISP\n"
			+ "Make sure your ISP is hooked up to your router.");
	}
}
