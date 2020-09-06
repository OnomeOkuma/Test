package com.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.app.generation.Generator;
import com.app.generation.GeneratorA;
import com.app.generation.GeneratorB;

public class RenmoneyTest {

	public static void main(String[] args) {

		while (true) {
			try {
				int numberOfPositiveComparisons = 0;

				System.out.println("Please Input the number of Comparisons: ");
				@SuppressWarnings("resource")
				Scanner userInput = new Scanner(System.in);
				int iterations = 0;
				iterations = userInput.nextInt();

				System.out.println("Please Input the Starting Number A: ");
				long numberA = 0;
				numberA = userInput.nextLong();

				System.out.println("Please Input the Starting Number B: ");
				long numberB = 0;
				numberB = userInput.nextLong();

				Generator generatorA = new GeneratorA();
				Generator generatorB = new GeneratorB();
				ValueComparator comparator = new ValueComparatorImpl();
				for (int counter = 0; counter < iterations; counter++) {
					if (comparator.compare(generatorA.generate(numberA), generatorB.generate(numberB)))
						numberOfPositiveComparisons++;

					numberA = generatorA.getRemainder();
					numberB = generatorB.getRemainder();
				}

				System.out.println("The number of positive comparisons is " + numberOfPositiveComparisons);
				System.out.println("If you would like to exit, press Y" );
				String exit = userInput.next();
				if(exit.equalsIgnoreCase("Y"))
					System.exit(0);
			} catch (InputMismatchException e) {
				System.out.println("Input a valid number");
			}

		}
	}
}
