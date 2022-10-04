package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printAllNumbersInListStructured(numbers);
		
		printEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> nembers) {
		for(int number:nembers) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> nembers) {
		for(int number:nembers) {
			if(number%2 == 0) {
				System.out.println(number);
			}
		}
	}

}
