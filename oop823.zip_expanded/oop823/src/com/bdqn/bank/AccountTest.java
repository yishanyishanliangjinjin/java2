package com.bdqn.bank;

import java.util.Scanner;

/**
 * 账户测试类
 * @author ldwjava
 *
 */
public class AccountTest {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		Accound accound = new Accound();
		do {
			System.out.println("1.c 2.q 0.e");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("输入出款金额:");
				double intoMoney = input.nextDouble();
				// 调用方法
				accound.intoMoney(intoMoney);
			} else if (choice == 2) {
				System.out.println("输入取款金额:");
				double outMoney = input.nextDouble();
				accound.outMoney(outMoney);
			} else {
				flag = false;
			}

		} while (flag);

	}
}
