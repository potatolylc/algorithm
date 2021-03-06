package completenumber;

import java.util.ArrayList;

public class CompleteNumberTest {

	/**
	 * Complete Number: find complete numbers from 1 to 1000
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 1000; i++){
			if(isComplete(i))
				list.add(i);
		}
		for(int result: list){
			System.out.print(result+", ");
		}
		System.out.println("\nThe total number of complete numbers: "+list.size());
	}
	
	protected static boolean isComplete(int num) {
		boolean flag = false;
		int sum = 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		if(num == sum)
			flag = true;
		return flag;
	}
}
