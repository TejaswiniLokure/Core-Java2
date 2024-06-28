package com.te.Learnjava8.firstMock;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("enter the first number");
		double num1 = scanner.nextDouble();
		System.out.println("enter the second number");
		double num2 = scanner.nextDouble();

		Double result = 0.00;

		Boolean Opearator = true;
		while (true) {
			System.out.println("\nChoose an operation: +, -, *, / ");
			String operation = scanner.next();

			if (operation.equals("exit")) {
				break;
			}

			if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
				System.out.println("Invalid operation. Please try again.");
				continue;
			}

			switch (operation) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("Error: Division by zero.");
				}
			default:
				break;
			}
			boolean validOperation = true;
			if (validOperation) {
				System.out.println("Result: " + result);
			}
		}

	}
	}




