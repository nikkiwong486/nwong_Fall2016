public class Calculate {
//Square
//input: #
//	output:#
	
	public static int square(int number) {
		int answer;
		answer=number*number;
		return answer;
	}
	public static int cube(int number) {
		int answer;
		answer=number*number*number;
		return answer;
	}
	public static double average(double number1, double number2) {
		double answer;
		answer=(number1+number2)/2;
		return answer;
	}
	public static double average(double number1, double number2, double number3) {
		double answer;
		answer=(number1+number2+number3)/3;
		return answer;
	}
	public static double toDegrees(double number) {
		double answer;
		answer=(180*number)/3.14159;
		return answer;
	}
	public static double toRadians(double number) {
		double answer;
		answer=(number*3.14159)/180;
		return answer;
	}
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer=((b*b)-(4*a*c));
		return answer;
	}
	public static String toImproperFrac(int wholenum, int numerator, int denominator){
		String answer="";
		 answer=(wholenum*denominator+numerator+"/"+denominator);
		return answer;
	}
	public static String foil(int number1, int number2, int number3, int number4) {
		String answer="";
		answer=(number1*number3+"n^2 + "+(number1*number4+number2*number3)+"n + "+(number2*number4));
		return answer;
	}
	public static boolean isDivisibleBy(int number1, int number2) {
		boolean answer;
		answer=(number1%number2==0);
		return answer;
	}
	public static double absValue(double number1) { 
		double answer;
		if (number1>0){
			answer = number1;
		}
		else {
			answer = -1 * number1;
		}
		return answer;
	}
	public static int max(int x, int y) {
		if (x>y) {
			return x;
		}
		return y;
	}
	public static double max(double x, double y, double z) {
		if (x>y && x>z) {
			return x;
		} else if (y>x && y>z) {
			return y;
		} else {
		return z;
		}
	}
	public static int min(int a, int b) {
		if (a<b) {
			return a;
		}
		return b;
	}
	public static double round2(double num1) {
		double answer;
		answer=num1*100;
		answer=answer+0.5;
		answer=(int) answer;
		answer= answer/100.0;
		return answer;
	}
	public static double exponent(double base, int power) {
		double answer=1;
		for(int i=1; i<=power;i++);
		answer = answer*base;
		return answer;
	}
	public static int factorial(int num) {
		int answer;
		answer= ((num*num) + num + 2);
		return answer;
	}
	public static boolean isPrime(int number1) {
		for (int i = 2; i < number1; i++) {
			if (number1%i==0) {
				return false;
			}
		}
		return true;
	}	
	public static int gcf(int a, int b) {
		int answer;
		answer = (a*b);
		return answer;
	}
	public static double sqrt(double square) {
		if (square <0)
			throw new IllegalArgumentException("Cannot root negative");
		double num;
		double squareRoot = square / 2;
		do {
			num = squareRoot;
			squareRoot = (num + (square / num)) / 2;
		} while ((num - squareRoot) != 0);
		return Calculate.round2(squareRoot);
	}
}