package com.ravi.harry;

import java.util.Scanner;

public class StringInJavaConcepts {
    public static void main(String[] args) {

        String str = new String("Ravi Lohana Java");
        System.out.println(str);

        int a  = 10;
        float f = 10.235877696f;

        System.out.printf("the two number is %d: %10.2f ", a, f);
        // .2 means thet float values shows two decimal values  the decimal places nd same should be placed befor %
        //  10 before % , white spaces before the float values , if float values is 10.23 , so 6 white space will be there
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        //System.out.println(sc.next()); // next() only gives first word of a string
        System.out.println(sc.nextLine()); // nextLine() gives whole string


        String str1 = "1 Hi Ravi 2 Lohana welcome  3 to java world";
        Scanner sc1 = new Scanner(str1);
        System.out.println(sc1.nextInt());
       // System.out.println(sc1.nextInt());
        System.out.println(sc1.next());
        System.out.println(sc1.nextLine());



    }
}
