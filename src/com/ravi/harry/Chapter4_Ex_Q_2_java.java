package com.ravi.harry;

// solution 2

import java.util.Scanner;

public class Chapter4_Ex_Q_2_java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English marks");
        float englishMarks = sc.nextFloat();
        System.out.println("Enter Hindi marks");
        float hindiMarks = sc.nextFloat();
        System.out.println("Enter Maths marks");
        float mathshMarks = sc.nextFloat();



        float totalPercentage = ((englishMarks + hindiMarks + mathshMarks ) / 300 ) * 100;
        System.out.println(totalPercentage);

        if(totalPercentage > 40 && englishMarks >= 33 && hindiMarks >= 33 && mathshMarks >= 33){
            System.out.println("Passed");
        }
        else {
            System.out.println("Fail");
        }


    }
}

