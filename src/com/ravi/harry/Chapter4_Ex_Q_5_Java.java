package com.ravi.harry;

import java.util.Scanner;

public class Chapter4_Ex_Q_5_Java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int userInputYear = sc.nextInt();

        if(userInputYear % 400 == 0){
            System.out.println("Leap Year");
        }
        else if(userInputYear % 100 == 0){
            System.out.println("NO Leap Year");
        }
        else if(userInputYear % 4 == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("No Leap Year");
        }

    }
}
