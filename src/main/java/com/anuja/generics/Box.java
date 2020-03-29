package com.anuja.generics;

public class Box<T1, T2> {

//	public void getBox(int[] box)		//here think there are 3 types of box arrays and all you need to traverse.
	public <E> void getbox(E[] box) { // but for that you need 3 methods. Here you can do it in one method
		for (E e : box) {
			System.out.print(e);
		}
	}

	public void display(T1 str, T2 num) {
		System.out.println(str + "," + num);
	}
}
