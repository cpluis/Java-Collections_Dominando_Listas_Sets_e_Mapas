package com.br.luis_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {

	public static void main(String[] args) {

		List<String> wordList = Arrays.asList("Apple","Banana", "Orange", "Guava");
		
		Spliterator<String> spliterator1 = wordList.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		
		spliterator1.forEachRemaining(System.out::println);
		System.out.println("Traversing the other of the spliterator...");
		spliterator2.forEachRemaining(System.out::println);
	}
}
