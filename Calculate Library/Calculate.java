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
	public static int average(int number) {
		int answer;
		answer=(number*number)/2;
		return answer;
	}
	public static double average(double number) {
		double answer;
		answer=(number+number)/2;
		return answer;
	}
	public static double toDegree(double number) {
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

}
