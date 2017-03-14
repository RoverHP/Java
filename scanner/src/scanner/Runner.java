package scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Calculator  calc = new Calculator(); 
		double result = calc.calcExpression(scn.nextLine()); 
		
		System.out.println("Result of expression is: " + result);

	}

}
