package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfacesAdv {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
				
		//Predicate - One input -> returns boolean
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
				
		//Functon - //Two inputs -> returns output Any types
		Function<Integer, Integer> squareMapper = x -> x * x;
		
		//Consumer - One input - No outputs
		Consumer<Integer> sysoutAction = System.out::println;
		
		/*
		numbers.stream()
			.filter(isEvenPredicateExpanded)
			.map(squareMapperExp)
			.forEach(sysoutActionExp);
		*/

		//Binary Operator - Two inputs and one output - All should be one type
		BinaryOperator<Integer> sumAccumulator = Integer::sum;
		
		int sum = numbers.stream()
				.reduce(0, sumAccumulator);
		
		System.out.println(sum);
				
		//Supplier - No input - One output - Factory pattern
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
//		System.out.println(randomIntegerSupplier.get());
		
		
		//Unary Operator - One input and one output - All should be one type
		UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
		
//		System.out.println(unaryOperator.apply(10));
		
		BiPredicate<Integer, String> biPredicate = (number, str) -> {
			return number < 5 && str.length() > 3;
		};
		
//		System.out.println(biPredicate.test(3, "Damith"));

	}
}
