package com.java.week2.example.scannerexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.java.week2.example.arraylistexample.ArrayListExample;
import com.java.week2.example.comparatorexample.ComparatorExample;

public class ScannerExample {

	public static void start() {
		Scanner num = new Scanner(System.in);
		Scanner deci = new Scanner(System.in);
		Scanner w = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner temp = new Scanner(System.in);
		
		List<ArrayListExample> list = new ArrayList<ArrayListExample>();
		
		while(true) {
			System.out.println("enter a number");
			int numbers = num.nextInt();
			System.out.println("number entered: "+numbers);
		
			System.out.println("enter a decimal number");
			double decimal = deci.nextDouble();
			System.out.printf("decimal number entered: %.1f\n", decimal);
			
			System.out.println("enter a word");
			String word = w.next();
			System.out.println("word entered: "+word);
		
			System.out.println("enter a sentence");
			String sentence = s.nextLine();
			System.out.println("sentence entered: "+sentence);
			
			
			list.add(new ArrayListExample(numbers, decimal, word, sentence));
			
			
			System.out.printf("If you want to quit, enter \"quit\", else type anything\n");
			String exit = temp.next();
			if(exit.equals("quit")) {
				break;
			}
		}
		
		Collections.sort(list, new ComparatorExample());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("set "+list.get(i).toString());
		}
	}
}
