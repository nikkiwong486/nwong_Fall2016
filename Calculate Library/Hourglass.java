public class Hourglass {

	public static void main(String[] args) {
		//print line 1
			lineWithQuotes();
			//print the top half
			printTopHalf();

//print line 6 (middle)
//print bottom half
//print last line (looks just like line 1)
	}
		public static void lineWithQuotes(){
			System.out.print("|");
			for(int j = 0; j<11; j++){
				System.out.print("\"");
			}
			System.out.println("|");	
		}	

		public static void printTopHalf(){
			for (int i=1; i<=4;i++){ //print the first 4 lines
				//Print the spaces
				for (int s=1; s<=i;s++){
					System.out.print(" ");
				}
				//Print the \
				System.out.print("\\");
				// Print the colons
				for (int k=0; k<=10-2*i;k++){
					System.out.print(":");
				}
				//Print the /
				System.out.println("/");

			}

		}
		public static void printMiddle(){
			System.out.println("");
		}
}
