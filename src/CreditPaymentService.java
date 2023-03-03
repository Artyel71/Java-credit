public class CreditPaymentService {
    public double calculate(double percentRate, int payments) {
        double Rate = ((percentRate * (Math.pow((1 + percentRate), payments))) / ((Math.pow(1 + percentRate, payments)) - 1));

        return Rate;


    }
}
