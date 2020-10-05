package com.ravi.harry;

public class LoopsPraticseSet_5 {
    public static void main(String[] args) {


        // print pattern
        /*
        ****
        ***
        **
        *
        */
/*
        for (int i =1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
*/
        // Wap to print fist n even numbers using while loop

/*
        int n = 1;
        int rangeNum = 20;
        while(n<=rangeNum){
                if(n%2==0){
                    System.out.println(n);
                }
            n++;

        }
*/

        //wap multiplication table of n
        int n=5;
//        for(int i=0;i<=10;i++){
//
//            int nMul = i * n ;
//            System.out.println(i + " * " +  n + "=" + nMul);
//
//        }

        // wap reverse multiplication table
/*
        for(int i=10;i>=0;i--){

            int nMul = i * n ;
            System.out.println(i + " * " +  n + "=" + nMul);

        }

 */
/*
        // wap factorial using for loop
        int nFact = 5;
        int fact = 1;
        for (int i = 1; i<=nFact;i++){
            fact = fact*i;
            System.out.println(fact);

        }
        System.out.println("Factorial of " + nFact + ": " + fact);

 */

        // wap cal sum of multiplication of 8

        int numMul = 8;
        int sum=0;
        for (int i=1; i<=10;i++){
            sum = sum + numMul*i;


        }
        System.out.println(sum);

    }
}
