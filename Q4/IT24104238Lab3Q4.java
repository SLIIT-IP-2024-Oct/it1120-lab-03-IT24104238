import java.util.Scanner;

public class IT24104238Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Separate and print the digits
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++) {
            System.out.print(numberStr.charAt(i) + " ");
        }

        scanner.close();
    }
}
