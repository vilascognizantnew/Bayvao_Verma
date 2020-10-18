import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int digits = sc.nextInt();
		int result = 0;
		
		while (digits > 0) {
			result += digits % 10;
			digits /= 10;
		}
		
		System.out.println("The sum of the digits is " + result);
		sc.close();
	}
}
