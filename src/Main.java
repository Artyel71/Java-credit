public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        Double percentRate = 9.99 / 12 / 100;
        int payments = 12;
        int credit = 1_000_000;
        double Rate = service.calculate(percentRate, payments);
        int payment = (int) (credit * Rate);
        System.out.println(payment);

    }
}