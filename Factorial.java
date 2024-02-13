package guviTask;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact=1, num;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(i = 1; i<=num; i++) 
        {
           fact = fact*i;
        }
        System.out.println("Factorial of the given number is:"+fact);
	}

}
