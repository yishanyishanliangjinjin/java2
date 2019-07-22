package com.bdqn.arr;

public class ArrayTest {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		ArrarUtil arrarUtil = new ArrarUtil();
		int[] array = arrarUtil.insertArray(a, 2, 110);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			System.out.println(array[i]);
		}

	}
}
