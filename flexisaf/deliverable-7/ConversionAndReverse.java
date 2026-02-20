import java.util.Scanner;

public class ConversionAndReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== Number to String =====
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        String numberAsString = String.valueOf(number);
        System.out.println("Number converted to String: " + numberAsString);

        // ===== String to Number =====
        System.out.print("\nEnter a numeric string: ");
        String numericString = scanner.next();

        int stringAsNumber = Integer.parseInt(numericString);
        System.out.println("String converted to Number: " + stringAsNumber);

        scanner.nextLine(); // clear buffer

        // ===== Reverse a String =====
        System.out.print("\nEnter a string to reverse: ");
        String text = scanner.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}