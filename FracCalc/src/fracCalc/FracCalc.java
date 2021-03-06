package fracCalc;

import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {
		// TODO: Read the input from the user and call produceAnswer with an
		// equation

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		while (input != "quit") {

			String answer = produceAnswer(input);
			System.out.println("\n");
			System.out.println(answer);
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
		String sResult = "";
		int[] result = new int[3];
		//call addFrac, subtractFrac, multiplyFrac, and divideFrac
		
		if(parsedExpression[1].trim().indexOf("+") >=0){
		
			result= addFrac(operand1, operand2);
		}
		if(parsedExpression[1].trim().indexOf("-") >=0){
		    result = subtractFrac(operand1, operand2);
		}
		if(parsedExpression[1].trim().indexOf("*") >=0){
			result = multiplyFrac(operand1, operand2);
		}if(parsedExpression[1].trim().indexOf("/") >=0){
			result = divideFrac(operand1, operand2);
		}
		if (result.length > 1)
			sResult = result[0] + "_" + result[1] + "/" + result[2];
	    if (result[1]==0){ 
		 sResult = result[0] + "";}

		// System.out.println(operation[2]);

		String s1 = parsedExpression[0];
		String s2 = parsedExpression[2];

		return sResult;
		

	}

	public static int[] parseOperand(String num) {
		int[] number = new int[3];
		if (num.indexOf("_") > 0) {
			String[] parseNumber = num.split("_");
			String whole = parseNumber[0];
			String fraction = parseNumber[1];

			String[] numDen = fraction.split("/");
			String numerator = numDen[0];
			String denominator = numDen[1];
			number[0] = Integer.parseInt(whole);
			number[1] = Integer.parseInt(numerator);
			number[2] = Integer.parseInt(denominator);
			

		} else if (num.indexOf("/") > 0) {
			String[] numeratorSplit = num.split("/");
			String numerator = numeratorSplit[0];
			String denominator = numeratorSplit[1];

			System.out.print("whole: 0");
			System.out.print(" numerator:" + numerator);
			System.out.println(" denominator:" + denominator);
			number[0] = 1;
			number[1] = Integer.parseInt(numerator);
			number[2] = Integer.parseInt(denominator);
		} else {
			System.out.println("whole:" + num + " numerator:0 denominator:0");
			number[0] = Integer.parseInt(num);
			number[1] = 0;
			number[2] = 0;
		}

		// System.out.println("Answer"+result);
		return  number;
	}

	// try to make something so that it will make sure the denominators are the
	// same
	// if operand1 and operand2 do not have a common denominator, multiply the two fractions
	// together to get the GCF.
	public static int[] addFrac(int[] operand1, int[] operand2) {
		int numerator1 = operand1[1] * operand2[2];
		int numerator2 = operand1[2] * operand2[1];
		//get the common denominator
		int commonDenom = operand1[2] * operand2[2];
		//add the numerator, keep the denominator
		int commonNumerator = numerator1 + numerator2;
		
		int[] answer = new int[3];
		answer[0]= commonNumerator/commonDenom;
		if (commonNumerator%commonDenom != 0){
			answer[1]= commonNumerator%commonDenom;
			answer[2]=commonDenom;
		} 
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

	public static int[] multiplyFrac(int[] operand1, int[] operand2) {
		// multiply both the fractions together
		int commonNumerator = operand1[1] * operand2[1];
		int commonDenom = operand1[2] * operand2[2];
		int result = commonNumerator/commonDenom;
		int[] answer = new int[3];
		if (commonNumerator>commonDenom){
			answer[0] = commonNumerator/commonDenom;
			answer[1] = commonNumerator%commonDenom;
			answer[2] = commonDenom;
		}else{ 
			answer[0] = 1;
			answer[1] = commonNumerator;
			answer[2] = commonDenom;
		}
		return answer;
	}

	public static int[] divideFrac(int[] operand1, int[] operand2) {
		// flip the second fraction over
		// multiply the two fractions together
		int temp = operand2[0];
		operand2[0] = operand2[1];
		operand2[1] = temp;
		int[] result = multiplyFrac(operand1, operand2);
		return result;
		
	}
}