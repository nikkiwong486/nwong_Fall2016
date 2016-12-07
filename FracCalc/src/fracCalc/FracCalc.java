package fracCalc;

import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {
		// TODO: Read the input from the user and call produceAnswer with an
		// equation

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		while (input != "quit") {

			produceAnswer(input);
			// System.out.println(answer);
			input = scanner.nextLine();
		}
		System.exit(0);

	}

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used
	// to test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated. For your program,
	// this will be the user input.
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		// TODO: Implement this function to produce the solution to the input
		String[] parsedExpression = input.split(" ");
		int[] operand1 = new int[3];
		int[] operand2 = new int[3];
		operand1 = parseOperand(parsedExpression[0]);
		operand2 = parseOperand(parsedExpression[2]);
		
 

		// System.out.println(operation[2]);

		String s1 = parsedExpression[0];
		String s2 = parsedExpression[2];

		parseNum(s2);

	}

	public static int[] parseOperand(String num) {
		if (num.indexOf("_") > 0) {
			String[] parseNumber = num.split("_");
			String whole = parseNumber[0];
			String fraction = parseNumber[1];

			String[] numDen = fraction.split("/");
			String numerator = numDen[0];
			String denominator = numDen[1];

		} else if (num.indexOf("/") > 0) {
			String[] numeratorSplit = num.split("/");
			String numerator = numeratorSplit[0];
			String denominator = numeratorSplit[1];

			System.out.print("whole: 0");
			System.out.print(" numerator:" + numerator);
			System.out.print(" denominator:" + denominator);
		} else {
			System.out.println("whole:" + num + " numerator:0 denominator:0");
		}

		// System.out.println("Answer"+result);
		return "";
	}

	// try to make something so that it will make sure the denominators are the
	// same
	// if operand1 and operand2 do not have a common denominator, multiply the two fractions
	// together to get the GCF.
	public static int[] addFrac(int[] operand1, int[] operand2) {
		//get the common denominator
		int commonDenom = operand1[1] * operand2[1];
		//add the numerator, keep the denominator
		int[] answer = new int[2];
		answer[0]= operand1[0] * operand2[1] + operand2[0] * operand1[1];
		answer[1] = commonDenom;
		return answer;
	}

	public static int[] subtractFrac(int[] operand1, int[] operand2) {
		//change the sign of the second numerator
		operand2[0] = operand2[0] * (-1);
		//call addFrac
		int[] answer = new int[2];
		answer= addFrac (operand1, operand2);
		return answer;
		
		
	}

	/*public static int[] multiplyFrac(String num) {
		// multiply both the fractions together
		return num;
	}

	public static int[] divideFrac(String num) {
		// flip the second fraction over
		// multiply the two fractions together
		return num;
	}
*/
}