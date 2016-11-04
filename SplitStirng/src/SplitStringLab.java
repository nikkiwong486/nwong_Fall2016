
//@author NikkiWong
import java.util.*;
import java.util.Arrays; 

public class SplitStringLab
{
	
	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples!".split("really")));
		System.out.println(Arrays.toString("breadcheesebread!".split("bread")));
		System.out.println(Arrays.toString("I like really cheesy bread!".split(" ")));
		System.out.println(Arrays.toString("".split(" ")));
		System.out.println(sandwich("x"));	
		System.out.println(sandwich("breadcheese"));
		System.out.println(sandwich("breadcheesebread"));
		System.out.println(sandwich("breadcheesemustardbreadlettuce"));
		System.out.println(sandwich("mmbreadcheesemustardbread"));
		System.out.println(sandwich("breadcheesemustardbreadlettucebread"));
		System.out.println(sandwich("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
	}
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		public static String sandwich(String ingredients){
			//Check for two slices of bread
			int breadCount = 0;
			if (ingredients.indexOf("bread")<0){
				return ("not a sandwich");
			}else{
				breadCount++;
				ingredients = ingredients.substring(ingredients.indexOf("bread")+5);
				if (ingredients.indexOf("bread")<0){
					return ("not a sandwich");
				}else{
					breadCount++;
					String[ ]inBetween=ingredients.split("bread");
					if(inBetween[0]==""){
						return ("not a sandwich");
					}else{
						return inBetween[0];
					}
				}
			}
		}
}
/*
			//	if (breadCount<2){
				//}
			
			//Get rid of everything that is on top
			
			
			
			/*
			// Finally we find out what is in the middle
			String[] middle = ingredients.split("bread");
			//System.out.println(middle);
			String result = "";
			for(int i = 0; i<middle.length; i++){
				result += middle [i];
			}
			
	
			return result;
		
	*/	
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

