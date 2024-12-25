package payment;

public class PaymentForm {
    public static void main(String[] args) {
        String method = "card";
        double amount = 150.0;

        if (amount > 0 && method.equalsIgnoreCase("card")) {
            System.out.println("Оплата картой: $" + amount);
            System.out.println("Оплата успешна!");
        } else {
            System.out.println("Ошибка оплаты.");
        }
    }
    }

