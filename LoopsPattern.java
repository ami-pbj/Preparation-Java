
/*
    Print below patterns
*/

import java.util.Scanner;

public class LoopsPattern {
    public static void main(String[] args) {

        /*
        
            -----###----- Pattern 1 -----###-----

            * * * * 
            * * * * 
            * * * * 
            * * * * 
            * * * *
        
        */

        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        /* 

            -----###----- Pattern 2 -----###-----

            * 
            * * 
            * * * 
            * * * * 
            * * * * * 

        */

        try (Scanner input = new Scanner(System.in)) {
            
            // System.out.print("Enter number : ");

            // int m = input.nextInt();

            int m = 5;
            
            for (int i = 1; i <= m; i++) {
                // System.out.print(i);
                for (int j = 1; j <= i; j++) {
                    // System.out.print(j);
                    System.out.print("* ");
                }
                // System.out.println(" *");
                System.out.println();
            }
        }


        System.out.println();


        /* 

            -----###----- Pattern 3 -----###-----

            1 
            1 2 
            1 2 3 
            1 2 3 4 
            1 2 3 4 5 

        */

        
        int p = 5;

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

                // System.out.print(i + " ");

                /*
                
                    1 
                    2 2 
                    3 3 3 
                    4 4 4 4 
                    5 5 5 5 5 

                */
                
            }

            System.out.println();
        }
        
        System.out.println();


        System.out.println("Pattern 3 :");

        /* 

            -----###----- Pattern 4 -----###-----

            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1

        */

        
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p-i+1; j++) {

                System.out.print(j + " ");

                // System.out.print(i + " ");

                /*
                
                    1 
                    2 2 
                    3 3 3 
                    4 4 4 4 
                    5 5 5 5 5 

                */
                
            }

            System.out.println();
        }
        
        System.out.println();


        /* 

            -----###----- Pattern 5 -----###-----

                    *
                  * *
                * * *
              * * * *
            * * * * *

        */

        int q = 5;

        for (int i = 1; i <= q; i++) {
            for (int j = 1; j <= 2*(q-i); j++) {

            // for (int j = 1; j <= q-i; j++) {

                /* 

                        *
                       **
                      ***
                     ****
                    *****

                */

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

                // System.out.print("*");

                /* 

                        *
                       **
                      ***
                     ****
                    *****

                */

                // System.out.print("* ");

                /*

                        * 
                       * * 
                      * * * 
                     * * * * 
                    * * * * *  
                
                */
            }

            System.out.println();
        }


        System.out.println();


        /* 

            -----###----- Pattern 6 -----###-----

            * * * * 
            * * * 
            * * 
            * 

        */

        int r = 5;

        for (int i = 1; i <= r; i++) {
            for (int j = 0; j <= r-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();





        /* 

            -----###----- Pattern 7 -----###-----

            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            * 

        */

        int b = 5;

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = b-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println();






        /* 

            -----###----- Pattern 8 -----###-----

            
                *
               **
              ***
             ****
            *****
             ****
              ***
               **
                *

        */


        int g = 5;

        // First Outer Loop

        for (int i = 1; i <= g; i++) {
            for (int j = 1; j <= g-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second Outer Loop

        for (int i = 1; i < g; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= g-i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println();

        

        /* 

            -----###----- Pattern 9 -----###-----

            
                    *
                  * *
                * * *
              * * * *
            * * * * *
              * * * *
                * * *
                  * *
                    *

        */


        // First Outer Loop

        for (int i = 1; i <= g; i++) {
            for (int j = 1; j <= 2*(g-i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Second Outer Loop

        for (int i = 1; i < g; i++) {
            for (int j = 1; j <= 2*i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= g-i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println();

        System.out.println("Pattern 10 : ");

        /* 

            -----###----- Pattern 10 -----###-----


            * * * * *
              * * * *
                * * *
                  * *
                    *

        */


        // First Outer Loop

        for (int i = 1; i <= g; i++) {
            for (int j = 1; j < 2*i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= g-i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println();

        





        /* 

            -----###----- Pattern 11 -----###-----

            
                *
               * *
              * * *
             * * * *
            * * * * *
             * * * *
              * * *
               * *
                *

        */


        int e = 5;

        // First Outer Loop

        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= e-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Second Outer Loop

        for (int i = 1; i < e; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= e-i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println();


        System.out.println("Pattern 12 : ");

        
        /* 

            -----###----- Pattern 12 -----###-----

            
            * * * * *
             * * * *
              * * *
               * *
                *
               * *
              * * *
             * * * *
            * * * * *

        */


        int f = 5;


        // Second Outer Loop

        for (int i = 1; i <= f; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= f-i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // First Outer Loop

        for (int i = 1; i < f; i++) {
            for (int j = 1; j < f-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }



        System.out.println();



        /* 

            -----###----- Pattern 13 -----###-----

                1
               2 2
              3   3
             4     4
            5       5
             4     4
              3   3
               2 2
                1 

        */

        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            for (int j = 0; j <= 2*i-3; j++) {
                if (j == 2*i-3) {
                    System.out.print(i);
                } else {

                    System.out.print(" ");

                    // System.out.print(i);

                    /*  
                            1
                           222
                          33333
                         4444444
                        555555555
                         4444444
                          33333
                           222
                            1

                    */

                }
            }

            System.out.println();
        }

        for (int i = a-1; i >= 1; i--) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            for (int j = 0; j <= 2*i-3; j++) {
                if (j == 2*i-3) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");

                    // System.out.print(i);

                    /*  
                            1
                           222
                          33333
                         4444444
                        555555555
                         4444444
                          33333
                           222
                            1

                    */

                }
            }

            System.out.println();
        }


        System.out.println();


        /* 

            -----###----- Pattern 14 -----###-----

                *
               * *
              *   *
             *     *
            *       *
             *     *
              *   *
               * *
                * 

        */


        int x = 5;

        // First Outer Loop

        for (int i = 0; i < x; i++) {

            // First Inner Loop

            for (int j = 1; j < x-i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j <= 2*i-1; j++) {
                if (j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");


                    // System.out.print("*");

                    /*       
                            *
                           ***
                          *****
                         *******
                        *********
                         *******
                          *****
                           ***
                            *
                            
                    */
                }
            }
            
            System.out.println();
        }


        // Second Outer Loop => Reverse of First Outer Loop

        for (int i = x-2; i >= 0; i--) {

            // Second Inner Loop is Same as First Inner Loop

            for (int j = 1; j < x-i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j <= 2*i-1; j++) {
                if (j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                    // System.out.print("*");

                    /*       
                            *
                           ***
                          *****
                         *******
                        *********
                         *******
                          *****
                           ***
                            *
                            
                    */
                }
            }
            
            System.out.println();
        }


        System.out.println();




        /* 

            -----###----- Pattern 15 -----###-----

            
            *********
             *******
              *****
               ***
                *
               ***
              *****
             *******
            *********

        */


        int c = 5;

        // First Outer Loop

        for (int i = c-1; i >= 0; i--) {

            // First Inner Loop

            for (int j = 1; j < c-i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j <= 2*i-1; j++) {
                if (j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print("*");

                }
            }
            
            System.out.println();
        }

        // Second Outer Loop

        for (int i = 1; i < c; i++) {
            for (int j = 1; j < c-i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j <= 2*i-1; j++) {
                if (j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print("*");

                }
            }

            System.out.println();
        }



        System.out.println();



        /* 

            -----###----- Pattern 16 -----###-----

            
            1 2 3 4 5
             2 3 4 5
              3 4 5
               4 5
                5
               4 5
              3 4 5
             2 3 4 5
            1 2 3 4 5

        */
    

        int d = 5;

        // First Outer Loop

        for (int i = d-1; i >= 0; i--) {
            
            // First Inner Loop
            for (int j = 1; j < d-i; j++) {
                System.out.print(" ");
            }

            for(int j = d-i; j <= d; j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }

        //Second Outer Loop

        for (int i = 1; i <= d-1; i++) {

            // Second Inner Loop           
            for (int j = 1; j < d-i ; j++) {   
                System.out.print(" ");
            }
        
            for(int j=d-i; j<=d; j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }



        System.out.println();


        /* 

            -----###----- Pattern 17 -----###-----

            
                *
               * *
              *   *
             *     *
            *********
             

        */


        // First Outer Loop

        for (int i = 1; i < e; i++) {
            for (int j = 1; j <= e-i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j <= 2*i-3; j++) {
                if (j == 2*i-3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Second Outer Loop

        for (int i = 1; i <= 2*e-1; i++) {
            System.out.print("*");
        }

        System.out.println();



        
        System.out.println();


        
        /* 

            -----###----- Pattern 18 -----###-----

            
                    1
                  2 1 2
                3 2 1 2 3
              4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5
              4 3 2 1 2 3 4 
                3 2 1 2 3 
                  2 1 2 
                    1 
                    
        */


        int k = 5;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= 2*(k-i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        for (int i = k-1; i >= 1; i--) {
            for (int j = 1; j <= 2*(k-i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }









        System.out.println();
    }
}
