package com.noadapter;

import com.models.Paypal;
import com.models.MoneyBooker;

public class ClientDemoNoAdapter {

	public static void main(String[] args) {
		Paypal pp = new Paypal();
		pp.sendPayment(25.4);
		
		MoneyBooker mb = new MoneyBooker();
		mb.doPayment(22.7);
		
//		Object payment[] = {new Paypal(), new MoneyBooker()};
//		double amount = 25.5;
//		for (Object obj : payment) {
//			if (obj.getClass().getSimpleName().equals("Paypal")) {
//                ((Paypal)obj).sendPayment(amount);
//            } else if (obj.getClass().getSimpleName().equals("MoneyBooker")) {
//                ((MoneyBooker)obj).doPayment(amount);
//            }
//		}
	}
}
/*
Problem:
	1. When PayPal changed the API method name from sendPayment to payAmount => all places (client code) that use sendPayment method need to be changed to payAmount. Imagine the amount of code we need to change and the time we need to spend for regression tests.
	=> solution: create PaypalAdapter that holds a reference to Paypal, and implements API which the client expects
	2. When we have a new payment: MoneyBooker. It has own payment method, called doPayment. Incompatible payment methods (APIs) between Paypal and MoneyBooker.
	
*/
	
	
	
	
	