package ch07;

import ch07.Customer;

public class GoldCustomer extends Customer {
	double salesRatio;

	public GoldCustomer(int cId, String cName) {
		super(cId, cName);

		cGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
