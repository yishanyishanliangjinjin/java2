package com.bdqn.bank;

/**
 * 账户类
 * @author ldwjava
 *
 */
public class Accound {

	double money = 10000; // 账户的余额

	// 查询余额的方法
	public double getMoney() {
		return money;
	}

	// 存钱的方法
	public void intoMoney(double intoMoney) {
		money = money + intoMoney;
		System.out.println("存款成功");
		System.out.println("余额:" + getMoney());
	}

	// 取钱的方法
	public void outMoney(double outMoney) {
		// 判断你的钱够不够取
		if (money > outMoney) {
			money = money - outMoney;
			System.out.println("取款成功!");
			System.out.println("余额:" + getMoney());
		} else {
			System.out.println("对不起,余额不足!");
		}
	}

}
