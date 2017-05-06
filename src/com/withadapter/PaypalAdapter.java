package com.withadapter;

import com.models.Paypal;

public class PaypalAdapter extends AbstractPaymentAdapter {
	private Paypal adaptee;
	
	public PaypalAdapter(Paypal adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void pay(double amount) {
		this.adaptee.sendPayment(amount);
	}

}
