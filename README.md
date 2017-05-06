# AdapterPattern

Without Adapter
--------------
```java
public class MoneyBooker {

	public void doPayment(double amount) {
		System.out.println("Paying via MoneyBooker: " + amount);
	}

}

public class Paypal {
	
	public void sendPayment(double amount) {
		System.out.println("Paying via Paypal: " + amount);
	}

}
public static void main(String[] args) {
	Paypal pp = new Paypal();
	pp.sendPayment(25.4);
	MoneyBooker mb = new MoneyBooker();
	mb.doPayment(22.7);
}
```

Problems
--------------
* When PayPal changed the API method name from sendPayment to payAmount => all places (client code) that use sendPayment method need to be changed to payAmount. Imagine the amount of code we need to change and the time we need to spend for regression tests.
	=> solution: create PaypalAdapter that holds a reference to Paypal, and implements API which the client expects
* When we have a new payment: MoneyBooker. It has own payment method, called doPayment. Incompatible payment methods (APIs) between Paypal and MoneyBooker.

Diagrams
--------------
- Class diagram

![alt text](https://github.com/vudph/AdapterPattern/blob/master/resources/AdapterPatternDiagram.png "Class Diagram")
