package scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner str = new Scanner(new Scanner(System.in).nextLine());
		
		double  operand1, operand2, result;
		String  operation;
		
		operand1 = str.nextDouble();
		operation = str.next();
		operand2 = str.nextDouble();
		
		str.close();
		
		if (operation.equals("+"))
		{
			result = operand1 + operand2;
		}
		else if (operation.equals("-"))
		{
			result = operand1 - operand2;
		}
		else if (operation.equals("*"))
		{
			result = operand1 * operand2;
		}
		else if (operation.equals("/"))
		{
			result = operand1 / operand2;
		}
		else if (operation.equals("%"))
		{
			result = operand1 * operand2 / 100;
		}
		else
		{
			throw new NullPointerException("Undefined operation:"+operation); 
		}
		
		System.out.println("Result of expression is: " + result);

	}

}
