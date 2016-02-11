import java.lang.*;
import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text;
			int A = 1, B = 0, C = 0;
			int glass;
				Scanner scan = new Scanner(System.in);
				do 	{
					System.out.print("Enter Charlecter (A  B  C) : ");
					text = scan.nextLine();
				if (text.length() > 50) {
				System.out.println("Input Charecter More 50");
				}

				} while (text.length() > 50);
	 	 for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
				glass = A;
				A = B;
		 		B = glass;
			 } else if (text.charAt(i) == 'B' || text.charAt(i) == 'b') {
				glass = B;
				B = C;
				C = glass;
			 } else if (text.charAt(i) == 'C' || text.charAt(i) == 'c') {
				glass = A;
				A = C;
				C = glass;
			}
		}
		 if (A == 1) {
			System.out.println("Ball Is 1");
		   } else if (B == 1) {
		  	System.out.println("Ball Is 2");
		 } else if (C == 1) {
		     	System.out.println("Ball Is 3");
		 }
	 }
//xxxxx
 }