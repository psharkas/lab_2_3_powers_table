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
//		String str2 = "Squared\n=======";
//		String str3 = "Cubed\n=======";
//		System.out.println(str1);
		
		
		
		for (int i = 1; i <= number; i++) {
			squared = (int) Math.pow(i, 2);
			cubed = (int) Math.pow(i, 3);
			
			str1 += "\n";
			str1 += i;
//			str1 += "          ";
//			str1 += squared;
//			str1 += "           ";
//			str1 += cubed;
		}
		System.out.println(str1);

		
//		
//		for (int i = 1; i <= number; i++) {
//			squared = (int) Math.pow(i, 2);
//			str2 += "\n";
//			str2+= squared;
//		}
//		
//		for (int i = 1; i <= number; i++) {
//			cubed = (int) Math.pow(i, 3);
//			str3 += "\n";
//			str3 += cubed;
//		}
	


	}

}
