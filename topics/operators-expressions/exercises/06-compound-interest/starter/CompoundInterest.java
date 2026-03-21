public class CompoundInterest {

    public static double compoundInterest(double principal, double rate, int timesPerYear, int years) {
        // TODO: Calculate compound interest
        // Formula: A = P * (1 + r/n)^(n*t)
        // Use Math.pow(base, exponent) for the power
        return 0.0;
    }

    public static void main(String[] args) {
        double amount = compoundInterest(1000.0, 0.05, 12, 10);
        System.out.println("$1000 at 5% for 10 years: $" + amount);
    }
}
