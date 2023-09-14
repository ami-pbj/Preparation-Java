public class armstrong {
    public static void main(String[] args) {

        /* // 3 Digits

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number."); */



        int nDigits = 1634, originalNdigits, remainder1, result1 = 0, n = 0;

        originalNdigits = nDigits;

        // for (;originalNdigits != 0; originalNdigits /= 10, ++n);

        for (;originalNdigits != 0; originalNdigits /= 10) {
            n++;
        }

        originalNdigits = nDigits;

        for (;originalNdigits != 0; originalNdigits /= 10)
        {
            remainder1 = originalNdigits % 10;
            result1 += Math.pow(remainder1, n);
        }


        if(result1 == nDigits)
            System.out.println("\n" + nDigits + " is an Armstrong number.");
        else
            System.out.println("\n" + nDigits + " is not an Armstrong number.");
    }


}
