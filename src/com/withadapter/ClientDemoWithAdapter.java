package com.withadapter;

import com.models.MoneyBooker;
import com.models.Paypal;

public class ClientDemoWithAdapter {

	public static void main(String[] args) {
		AbstractPaymentAdapter paymentAdapter = new PaypalAdapter(new Paypal());
		paymentAdapter.pay(24.6);
		
		paymentAdapter = new MoneyBookerAdapter(new MoneyBooker());
		paymentAdapter.pay(55.3);
	}

}

/*
Note: 
	1. If PayPal changes its method name from sendPayment to payAmount. Then we just need to update changes in PaypalAdapter code which has just one change. No need to change at client code.
	2. Regardless of Paypal or MoneyBooker the payment method at client code just calls pay method.
*/
