package com.techlab.accounttest;

import com.techlab.account.Account;

public class AccountTest {
	public static void main(String args[]) {
		Account a1 = new Account(101,"A1",4500);
		Account a2 = new Account(101,"A2",5000);
		System.out.println(a1);
		System.out.println(a2.toString());
		System.out.println(a1.hashCode());
		System.out.println(a1.equals(a2));
	}
}
