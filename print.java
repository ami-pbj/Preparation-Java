
import java.util.Scanner;

public class print {
    public static void main(String[] args) {

        try(
            Scanner number_input = new Scanner(System.in)
        ) {
            System.out.print("Enter a Number: ");

            int n = number_input.nextInt();

            if (checkPrime(n)) {
                System.out.print(n + " is a prime number.");
            } else {
                System.out.print(n + " is not a prime number.");
            }
            
        }
        
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // public static void main(String[] args) {
    //     try(
    //         Scanner number_input = new Scanner(System.in)
    //     ) {
    //         System.out.print("Enter start number : ");
    //         int start = number_input.nextInt();

    //         System.out.print("Enter end number : ");
    //         int end = number_input.nextInt();

    //         System.out.println("Prime numbers between " + start + " and " + end + " are : ");

    //         for (int i = start; i < end; i++) {
    //             if (checkPrime(i)) {
    //                 System.out.println(i);
    //             }
    //         }
    //     }
    // }

    // private static boolean checkPrime(int n) {
    //     if(n <= 1) {
    //         return false;
    //     }

    //     for (int i = 2; i <= n/2; i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }

}
