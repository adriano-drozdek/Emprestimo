package services;

public class PaypalService implements OnlinePaymentService {

	private static final double PAYMENT_FEE = 0.02;

	@Override
	public double paymentFree(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {

		return 0;
	}

}
