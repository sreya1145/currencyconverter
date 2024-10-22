import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToInr = 74.85;  // Static conversion rate

        System.out.println("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        double inr = usd * usdToInr;

        System.out.println("Amount in INR: " + inr);
    }
}
