import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int number = scnr.nextInt();
		
		int squared = 0;
		int cubed = 0;
		
		String str1 = "Number     Squared     Cubed\n======     =======     ======";
		
		// grab the index required for formatting
		int squared_index = str1.indexOf("Squared");
		int cubed_index = str1.indexOf("Cubed");
		
		for (int i = 1; i <= number; i++) {
			squared = (int) Math.pow(i, 2);
			cubed = (int) Math.pow(i, 3);	
			str1 += "\n";
			str1 += str1.format("%-11d", i);
			str1 += str1.format("%-12d", squared);
			str1 += cubed;
		}
		System.out.println(str1);

	}

}
