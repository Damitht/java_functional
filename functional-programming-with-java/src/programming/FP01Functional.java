package programming;

import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> knowledgeAreas = List.of("Java advanced", "Microservices", "AWS devops Prof", "ReactJS", "Python");
//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
//		printOddNumbersInListFunctional(numbers);
//		printAllStrings(knowledgeAreas);
//		printKnowledgeAreasWithMicro(knowledgeAreas);
//		knowledgeAreaWithFourChars(knowledgeAreas);
//		printSquaresofEvenNumbers(numbers);
//		printCubeOfOddNumbers(numbers);
		printCharactersOFKA(knowledgeAreas);
	}

//	private static void print(int number) {
//		System.out.println(number);
//	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
//		numbers.stream().forEach(FP01Functional::print);
		
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printAllStrings(List<String> knowledgeAreas) {
		knowledgeAreas.stream()
		.forEach(System.out::println);
	}
	
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {	
		numbers.stream()
//		.filter(FP01Functional::isEven)
		.filter(number -> number%2 == 0)
		.forEach(System.out::println);
	}
	
	private static boolean isOdd(Integer number) {
		return number%2 == 1;
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2==1)
		.forEach(System.out::println);
		
	}
	
	private static void printKnowledgeAreasWithMicro(List<String> knowledgeAreas) {
		knowledgeAreas.stream()
			.filter(knowledgeArea -> knowledgeArea.contains("Micro"))
			.forEach(System.out :: println);
	}
	
	private static void knowledgeAreaWithFourChars(List<String> knowledgeAreas) {
		knowledgeAreas.stream()
			.filter(knowledgeArea -> knowledgeArea.length() >3)
			.forEach(System.out :: println);
	}
	
	private static void printSquaresofEvenNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 0)
			.map(number -> number * number)
			.forEach(System.out::println);
	}
	
	private static void printCubeOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 1)
			.map(number -> number * number * number)
			.forEach(System.out::println);
	}
	
	private static void printCharactersOFKA(List<String> knowledgeAreas) {
		knowledgeAreas.stream()
			.map(ka -> ka + " -> " +ka.length())
//			.forEach(System.out::println);
			.forEach(x-> System.out.println(x));
	}
}
