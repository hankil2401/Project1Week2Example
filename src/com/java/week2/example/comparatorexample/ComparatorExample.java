package com.java.week2.example.comparatorexample;

import java.util.Comparator;

import com.java.week2.example.arraylistexample.ArrayListExample;

public class ComparatorExample implements Comparator<ArrayListExample>{

	@Override
	public int compare(ArrayListExample o1, ArrayListExample o2) {
		return o1.word.compareTo(o2.word);
	}
}
