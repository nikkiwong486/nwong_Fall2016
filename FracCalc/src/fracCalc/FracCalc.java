package fracCalc;
import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation

    	
    	
    	Scanner scanner = new Scanner(System.in);
    	String input = scanner.nextLine();
    	while (input != "quit"){
    		
    		String answer = produceAnswer(input);
    		System.out.println(answer);
    		input = scanner.nextLine();
    	}
    	System.exit(0);
   
    	
    			
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] operation = input.split("\\s+");
        int result = 0;
        
    		System.out.println(operation[2]);
    		
    		String s1 = operation[0];
    		String s2 = operation[2];
    		if (s2.indexOf("_")>0){
    			String[] parseNumber = s2.split("_");
    			String whole = parseNumber[0];
    			String[] numDen = parseNumber[1].split("/");
    			String numerator = numDen[1];
    			String denominator = numDen[2];
    			System.out.print("whole:" + parseNumber[1]);
    			System.out.print("numerator:" + numDen[1]);
    			System.out.print("denominator:" + numDen[2]);
    		}
        
        System.out.println("Answer"+result);
        return "" + result;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
