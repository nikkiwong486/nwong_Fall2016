//


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
	public static boolean inDivisibleBy(int number1, int number2) {
		boolean answer;
		answer=(number2/number1);
		return answer;
	}
	public static double absValue(double number1, double number2) {
		x<=0; 
		double answer;
		answer=((number1+number2)*(-1));
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
	public static double round2(double num1, int num2) {
		double number;
		num1*100;
		num1>0.5;
		int num2;
		return num1;
		
	}
}