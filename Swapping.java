package guviTask;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Original values:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        int n = num1;
        num1 = num2;
        num2 = n;
        
        System.out.println("\n");
        System.out.println("Swapped values:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
 
	}

}
