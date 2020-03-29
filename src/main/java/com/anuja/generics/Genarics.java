package com.anuja.generics;

public class Genarics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] boxInt = { 1, 2, 3, 4, 5, 6 };
		Character[] boxChar = { 'a', 'b', 'c' };

		// how generic class behave
		new Box<String, Integer>().display("Anuja", 10);

		// how generic method behave
		new Box<String, Integer>().getbox(boxInt);
		new Box<String, Integer>().getbox(boxChar);
	}

}
