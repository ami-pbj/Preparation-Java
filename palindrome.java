import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try(
            Scanner inputScanner = new Scanner(System.in)
        ) {
            System.out.print("Enter Number : ");

            int number = inputScanner.nextInt();

            int temp = number;

            int sum = 0;

            while(temp > 0) {
                int remainder = temp % 10;

                sum = (sum * 10) + remainder;

                temp = temp / 10;
            }

            if (number == sum) {
                System.out.println(number + " is a palindrome number.");
            } else {
                System.out.println(number + " is not a palindrome number.");
            }
        }
    }
}
