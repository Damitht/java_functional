package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		
		//Predicate - One input -> returns boolean
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
		Predicate<Integer> isEvenPredicateExpanded = new Predicate<Integer>() {

			@Override
			public boolean test(Integer x) {
				return  x%2 == 0;
			}
		};
		
		//Functon - //Two inputs -> returns output Any types
		Function<Integer, Integer> squareMapper = x -> x * x;
		
		Function<Integer, String> integerToStringMapper = x -> x + " Damith";
		
		Function<Integer, Integer> squareMapperExp = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		};
		
		//Consumer - One input - No outputs
		Consumer<Integer> sysoutAction = System.out::println;
		
		Consumer<Integer> sysoutActionExp = new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
		/*
		numbers.stream()
			.filter(isEvenPredicateExpanded)
			.map(squareMapperExp)
			.forEach(sysoutActionExp);
		*/
		
		Consumer<String> sysoutIntToStrActionExp = new Consumer<String>() {

			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		};
		
		numbers.stream()
			.filter(isEvenPredicateExpanded)
			.map(integerToStringMapper)
			.forEach(sysoutIntToStrActionExp);
		

		//Binary Operator - Two inputs and one output - All should be one type
		BinaryOperator<Integer> sumAccumulator = Integer::sum;
		
		BinaryOperator<Integer> sumAccumulatorExp = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		
		int sum = numbers.stream()
				.reduce(0, sumAccumulatorExp);
		
		System.out.println(sum);
		
		
		//Supplier - No input - One output - Factory pattern

	}

}
