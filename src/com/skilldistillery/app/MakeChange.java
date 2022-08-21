package com.skilldistillery.app;

public class MakeChange {

	public static void main(String[] args) {

		java.util.Scanner kb = new java.util.Scanner(System.in);

		double out = 0.0;
		double itemPrice;
		double tendered;
		int twenty = 2000;
		int ten = 1000;
		int five = 500;
		int one = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;

		System.out.println("Enter the price of the item you would like to purchase: ");
		itemPrice = kb.nextDouble();

		System.out.println("Enter the amount tendered: ");
		tendered = kb.nextDouble();

		int change = (int) ((100 * tendered) - (100 * itemPrice));
//		int change1 = change;

		if (tendered < itemPrice) {
			System.out.println("Error: Amount tendered does not cover the cost of the item you wish to purchase.");
		}

		else if (tendered == itemPrice) {
			System.out.println("Exact change given. Thank you for your purchase!");
		}

		else if (tendered > itemPrice) {

			if (2000 <= change) {
				twenty = change / 2000;
				twenty = ((100 * twenty) % 2000) / 100;
				change = change - (twenty * 2000);
				System.out.print(twenty + " twenty dollar bill(s) ");

			}
			if (1000 <= change) {
				ten = change / 1000;
				ten = ((100 * ten) % 1000) / 100;
				change = change - (ten * 1000);
				System.out.print(ten + " ten dollar bill(s) ");
			}
			if (500 <= change) {
				five = change / 500;
				five = ((100 * five) % 500) / 100;
				change = change - (five * 500);
				System.out.print(five + " five dollar bill(s) ");
			}
			if (100 <= change) {
				one = change / 100;
				one = ((100 * one) / 100) / 100;
				change = change - (one * 100);
				System.out.print(one + " one dollar bill(s) ");
			}
			if (25 <= change) {
				quarter = change / 25;
				quarter = ((100 * quarter) % 25);
				change = change - (quarter * 25);
				System.out.print(quarter + " quarter(s) ");
			}
			if (10 <= change) {
				dime = change / 10;
				dime = ((100 * dime) % 10);
				change = change - (dime * 10);
				System.out.print(dime + " dime(s) ");
			}
			if (5 <= change) {
				nickel = change / 5;
				nickel = ((100 * nickel) % 5);
				change = change - (nickel * 5);
				System.out.print(nickel + " nickel(s) ");
			}
			if (1 <= change) {
				penny = change / 1;
				penny = ((100 * penny) / 1);
				change = change - penny;
				System.out.print(penny + " penny(ies) ");
			}
			System.out.println(itemPrice + " " + " " + tendered + " ");

		}

	}
}
