import java.util.Scanner;

public class IT24104238Lab3Q1B {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

       
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();

       
        double totalAmount = pricePerKg * quantityKg;

       
        double discount = totalAmount * 0.10;

        
        double finalAmount = totalAmount - discount;

       
        System.out.printf("The total amount is: %.1f\n", totalAmount);
        System.out.printf("Discount (10%%): %.1f\n", discount);
        System.out.printf("Final amount after discount: %.1f\n", finalAmount);

      
        scanner.close();
    }
}
