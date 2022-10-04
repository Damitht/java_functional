package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviorParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		filterAndPrint(numbers, x -> x%2 == 0);
		System.out.println("--------------------------");
		filterAndPrint(numbers, x -> x%2 == 1);
		System.out.println("--------------------------");
	
		System.out.println(mapFunction(numbers, x -> x*x));
		System.out.println(mapFunction(numbers, x -> x*x*x));
	}

	private static List<Integer> mapFunction(List<Integer> numbers, Function<Integer, Integer> mapper) {
		 return numbers.stream()
			.map(mapper)
			.collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream()
			.filter(predicate)
			.forEach(System.out::println);
	}

}
