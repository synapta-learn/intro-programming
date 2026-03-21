import java.util.ArrayList;

interface Payment {
    double getAmount();
    String getMethod();
    String receipt();
}

class CreditCard implements Payment {
    private double amount;
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getMethod() {
        return "Credit Card";
    }

    @Override
    public String receipt() {
        // TODO: "Paid $[amount] via Credit Card ending in [last 4 digits]"
        return "";
    }
}

class BankTransfer implements Payment {
    private double amount;
    private String bankName;

    public BankTransfer(double amount, String bankName) {
        this.amount = amount;
        this.bankName = bankName;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getMethod() {
        return "Bank Transfer";
    }

    @Override
    public String receipt() {
        // TODO: "Paid $[amount] via Bank Transfer from [bankName]"
        return "";
    }
}

class Cash implements Payment {
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getMethod() {
        return "Cash";
    }

    @Override
    public String receipt() {
        // TODO: "Paid $[amount] in Cash"
        return "";
    }
}

public class Solution {

    /**
     * Returns a list of receipt strings, one per payment.
     */
    public static ArrayList<String> processAll(ArrayList<Payment> payments) {
        // TODO: Collect each payment's receipt()
        return new ArrayList<>();
    }

    /**
     * Returns the total amount across all payments.
     */
    public static double totalAmount(ArrayList<Payment> payments) {
        // TODO: Sum all getAmount() values
        return 0;
    }
}
