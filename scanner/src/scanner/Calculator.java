package scanner;

import java.util.Scanner;

public class Calculator {
	public double calcExpression(String expression){
		Scanner str = new Scanner(expression);
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
			throw new UnsupportedOperationException("Undefined operation:"+operation); 
		}
		
		return result;
	}

}
