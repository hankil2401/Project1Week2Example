package com.java.week2.example.arraylistexample;

public class ArrayListExample {
	public int number;
    public double decimal;
    public String word;
    public String sentence;
    
    public ArrayListExample(int number, double decimal, String word, String sentence){
        this.number=number;
        this.decimal=decimal;
        this.word=word;
        this.sentence=sentence;
    }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		return "ArrayListExample [number=" + number + ", decimal=" + decimal + ", word=" + word + ", sentence="
				+ sentence + "]";
	}
}
