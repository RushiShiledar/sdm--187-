package p1;

import java.util.Scanner;

//Addition of two binary numbers
public class AddBinaryNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first binary number :");
		String x = sc.next();
		System.out.println("Enter second binary number :");
		String y =sc.next();
		
		int n1 = Integer.parseInt(x, 2);
		int n2 = Integer.parseInt(y, 2);
		int n3 = n1+n2;
		
		System.out.println("n3 :n1+n2 :"+Integer.toBinaryString(n3));
	}

}
