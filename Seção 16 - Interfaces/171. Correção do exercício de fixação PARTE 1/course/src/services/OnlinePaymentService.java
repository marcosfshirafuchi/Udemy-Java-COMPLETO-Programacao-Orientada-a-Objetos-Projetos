package services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(int months);
}
