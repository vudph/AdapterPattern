package com.withadapter;

import com.models.MoneyBooker;

public class MoneyBookerAdapter extends AbstractPaymentAdapter {
	private MoneyBooker adaptee;
	
	public MoneyBookerAdapter(MoneyBooker adaptee) {
		this.adaptee = adaptee;
	}
	
	
	@Override
	public void pay(double amount) {
		adaptee.doPayment(amount);
	}

}
