import java.util.Scanner;

public class factorialNumber {

    // Using Recursion
    static int factorial(int n) {

        if (n == 0)
            return 1;    
        else
            return(n * factorial(n-1));
    }    
    public static void main(String args[]) {  

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");

        int num = sc.nextInt();

        int fact=1;

        fact = factorial(num);   
        System.out.println("Factorial of "+num+" is: "+fact);  
        
        
        // Using Loop
        int i,loopFact=1;  

        for(i=1;i<=num;i++){    
            loopFact=loopFact*i;    
        }    
        System.out.println("Factorial of "+num+" is: "+loopFact);    
   
    }        
}
