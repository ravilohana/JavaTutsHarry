package com.ravi.harry;

import java.util.Scanner;

public class
    ScannerClassJavaConcepts {

    public static void main(String[] args) {

        Scanner scanClassJava = new Scanner(System.in);
        System.out.println("Enter the int number 1");
        int a = scanClassJava.nextInt();
        System.out.println("Enter the int number 2");
        int b = scanClassJava.nextInt();
        int sum = a+b;
        System.out.println("SUM : " +sum);
        System.out.println("Enter the float number 1");
        float f1 = scanClassJava.nextFloat();
        System.out.println("Enter the float number 1");
        float f2 =  scanClassJava.nextFloat();
        float sub = f2 - f1;
        System.out.println("Sub " + sub);
        System.out.println("Enter the first name");
        String fName = scanClassJava.next();
        System.out.println("Enter the last name");
        String lName = scanClassJava.next();
        String fullName = fName + " " + lName;
        System.out.println(fullName);








    }
}
