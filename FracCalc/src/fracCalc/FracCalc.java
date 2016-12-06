package fracCalc;
import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation

    	
    	
    	Scanner scanner = new Scanner(System.in);
    	String input = scanner.nextLine();
    	while (input != "quit"){
    			
    		produceAnswer(input);
    		//System.out.println(answer);
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
    public static void produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] operation = input.split("\\s+");
        int result = 0;
        
    		//System.out.println(operation[2]);

    		String s1 = operation[0];
    		String s2 = operation[2];
    		
    		parseNum(s2);
    		
    }		
    public static String parseNum(String num){		
    		if (num.indexOf("_")>0){
    			String[] parseNumber = num.split("_");
    			String whole = parseNumber[0];
    			String fraction = parseNumber[1];
    			
    			String[] numDen = fraction.split("/");
    			String numerator = numDen[0];
    			String denominator = numDen[1];
    			
    			System.out.print("whole:" + whole);
    			System.out.print(" numerator:" + numerator);
    			System.out.print(" denominator:" + denominator);
    			
    		}else if(num.indexOf("/") > 0){
    			String[] numeratorSplit = num.split("/");
    				String numerator = numeratorSplit[0];
    				String denominator = numeratorSplit[1];
    				
    				System.out.print("whole: 0");
    				System.out.print(" numerator:" + numerator);
    				System.out.print(" denominator:" + denominator);		
    		}else{
    			System.out.println("whole:" + num +  " numerator:0 denominator:0");
    		}
        
       // System.out.println("Answer"+result);
       return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String addFrac(String num){
    //if s1 and s2 do not have a common denominator, multiply the two fractions together to get the GCF.
    	// add the numerator, keep the denominator
    	return num;
    	System.out.println("a")
    }
    public static String subtractFrac(String num){
    return num;
    }
    public static String multiplyFrac(String num){
    return num;	
    }
    public static String divideFrac(String num){
    return num;	
    }

}