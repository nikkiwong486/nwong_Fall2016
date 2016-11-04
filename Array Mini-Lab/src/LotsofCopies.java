import java.util.Arrays;

public class LotsofCopies
{
	public static void main (String[] args)
	{	
			int num = 7;
			String strMain = "APCS";
			int [] arrMain = {1, 2, 3, 4, 5};
			//System.out.print(Arrays.toString(arrMain));
			changeMe (num, strMain, arrMain);
			System.out.println(num);
			System.out.println(strMain);
			System.out.println(Arrays.toString(arrMain));
			int a = 9;
			int b = 17;
			testIntValue(a, b);
			String str1 = "pizza";
			String str2 = "hamburger";
			testStringValue(str1, str2);
			String[] x = {"pizza", "hamburgers", "tacos"};
			String[] y = {"cheese", "coke", "fork"};
			testArrayValue(x, y);
		}
	public static void changeMe (int x, String str, int [] arr)
	{ 
		System.out.println(x);
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
		System.out.println("Initial");
		x = 48;
		str = "apples";
		for (int i = 0; i <= 3; i++){
		arr[i] = i;
		} 
		System.out.println("After");
		System.out.println(x);
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void testIntValue(int a, int b){
		System.out.println(a);
		System.out.println(b);
		b = a;
		a = 23;
		System.out.println(a);
		System.out.println(b);
	}
	public static void testStringValue(String a, String b){
		System.out.println(a);
		System.out.println(b);
		b = a;
		a = "tacos";
		System.out.println(a);
		System.out.println(b);
	}
	public static void testArrayValue(String[] a, String[] b){
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		b = a;
		a = new String[]{"Lauren", "Evan", "Jared"};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}