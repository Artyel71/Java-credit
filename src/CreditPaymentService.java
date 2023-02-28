public class CreditPaymentService {
    public double calculate(double a, int b) {
        double c = ((a * (Math.pow(1 + a, b))) / ((Math.pow(1 + a, b)) - 1));


        return c;


    }
}
