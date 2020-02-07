package com.ajr;

import java.lang.String;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.File;
import java.io.IOException;

public class JavaStreams {
	public static void main(String[] args) throws IOException {
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();

		IntStream.range(1, 10).skip(3).forEach(System.out::print);
		System.out.println();

		// 1. Integer Stream
		System.out.println(IntStream.range(1, 10).sum());

		
		
		Optional<String> optional = Stream.of("Ava", "Aneri", "Alberto")
		.sorted().findFirst();
		if(optional.isPresent()) {
			System.out.println("first element"+optional);
		}
		
		System.out.println();
		
		
		Stream.of("Ava", "Aneri", "Alberto").forEach(System.out::println);
		
//		List<Integer> collect = Stream.of("1", "2", "4").map(val->Integer.valueOf(val)).filter(a->a % 2==0).collect(Collectors.toList());
		
		System.out.println("Sum"+ Stream.of("1", "2", "4").map(val->Integer.valueOf(val)).filter(a->a % 2==0).collect(Collectors.summingInt(Integer::intValue)));
		
		System.out.println("Sum"+ Stream.of("1", "2", "4").map(val->Integer.valueOf(val)).filter(a->a % 2==0).reduce(0, Integer::sum));
		
	//	System.out.println("collect"+collect); 
		
		System.out.println(Paths.get("/bands.txt"));
		//File f = new File( 
				//"/bands.txt");
		//System.out.println(f.exists());
		//List<String> as = Files.readAllLines(Paths.get("/bands.txt")).stream().sorted().filter(line->(line.length()>20)).collect(Collectors.toList());

	}
}