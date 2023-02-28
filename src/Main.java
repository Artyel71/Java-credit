public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        Double a = 9.99 / 12 / 100;
        int b = 36;
        int credit = 1_000_000;
        double rate = service.calculate(a, b);
        int payment = (int) (credit * rate);
        System.out.println(payment);

    }
}