package com.bdqn.arr;

public class ArrarUtil {

	public int[] insertArray(int[] arr, int index, int value) {
		for (int i = arr.length - 1; i >= index; i--) {
			arr[i] = arr[i - 1];// 移位操作
		}
		arr[index - 1] = value;

		return arr;
	}
}
