package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App01 {

	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1= list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");

		System.out.println(Arrays.toString(st2.toArray()));
		Stream<Integer>st3= Stream.iterate(1, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
	}

}
