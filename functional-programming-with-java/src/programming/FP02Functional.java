package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
	
	private static Integer sum(Integer a, Integer b) {
		return a + b;
	}
	
	private static Integer addListFuntional(List<Integer> numbers) {
		return numbers.stream()
//			.reduce(0, FP02Functional::sum);
//			.reduce(0, (x,y) -> x + y);
			.reduce(0, Integer::sum);
	}
	
	
	private static Integer calculateSumOfCubes(List<Integer> numbers) {
		return numbers.stream()
			.map(number -> number * number * number)
			.reduce(0, Integer::sum);
	}
	
	private static Integer sumOfAllOddNumbers(List<Integer> numbers) {
		return numbers.stream()
				.filter(number -> number % 2 ==1)
				.reduce(0, Integer::sum);
	}
	
	private static void sortDistinctNumbesList(List<Integer> numbers) {
		numbers.stream()
			.distinct()
			.sorted()
			.forEach(System.out::println);
	}
	
	private static void sortStringList(List<String> ka) {
		ka.stream()
		.sorted()
		.forEach(System.out::println);
	}
	
	private static void sortStringListInNatural(List<String> ka) {
		ka.stream()
		.sorted(Comparator.naturalOrder())
		.forEach(System.out::println);
	}
	
	private static void sortStringListInReverse(List<String> ka) {
		ka.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}
	
	private static void sortStringListInLength(List<String> ka) {
		ka.stream()
		.sorted(Comparator.comparing(str -> str.length()))
		.forEach(System.out::println);
	}
	
//	private static void sortStringListInLengthReverse(List<String> ka) {
//		ka.stream()
//		.sorted(Comparator.reverseOrder().comparing(str -> str.length()))
//		.forEach(System.out::println);
//	}
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> knowledgeAreas = List.of("Java advanced", "Microservices", "AWS devops Prof", "ReactJS", "Python");

//		System.out.println(addListFuntional(numbers));
//		System.out.println(calculateSumOfCubes(numbers));
//		System.out.println(sumOfAllOddNumbers(numbers));
		
		//Max value
//		System.out.println(numbers.stream()
//				.reduce(Integer.MIN_VALUE, (x,y) -> x>y ? x:y));
		
		//Min Value
		System.out.println(numbers.stream()
				.reduce(Integer.MAX_VALUE, (x,y) -> x<y ? x:y));
		
//		sortDistinctNumbesList(numbers);
		
//		sortStringList(knowledgeAreas);
		
//		sortStringListInLength(knowledgeAreas);
		
		List<Integer> squareList = numbers.stream()
			.map(number -> number * number)
			.collect(Collectors.toList());
//		
		System.out.println(squareList);
		
		List<Integer> evenNumbers = numbers.stream()
				.filter(number -> number%2 == 0)
				.collect(Collectors.toList());
//		
		System.out.println(evenNumbers);
		
	
		List<Integer> lengthList = knowledgeAreas.stream()
			.map(ka -> ka.length())
			.collect(Collectors.toList());
		System.out.println(lengthList);
	}
}
