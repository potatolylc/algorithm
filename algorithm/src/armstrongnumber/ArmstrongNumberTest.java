package armstrongnumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumberTest {

	/**
	 * Armstrong Number
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input a 3 digits number");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		while(input < 100 || input > 999){
			System.out.println("Please input a 3 digits number.");
			input = scanner.nextInt();
		}
		int a = input/100;
		int b = input%100/10;
		int c = input%100%10;
		if(input == (cube(a)+cube(b)+cube(c)))
			System.out.println(input+" is a narcissistic number");
		else
			System.out.println(input+" is NOT a narcissistic number");
		
		System.out.println("******************************");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 100; i < 1000; i++){
			if(i == (cube(i/100)+cube(i%100/10)+cube(i%100%10)))
				list.add(i);
		}
		for(int i: list){
			System.out.print(i+", ");
		}
		System.out.println("\nThe total number of narcissistic numbers is "+list.size());		
	}
	
	protected static int cube(int num) {
		return num*num*num;
	}

}
