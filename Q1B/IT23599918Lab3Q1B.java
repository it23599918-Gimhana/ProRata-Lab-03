import java.util.Scanner;

public class IT23599918Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double total = price * kilograms;
        double discount = total * 0.10;
        double amountToPay = total - discount;

        System.out.println("The total amount is: " + total);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to pay after discount: " + amountToPay);
    }
}