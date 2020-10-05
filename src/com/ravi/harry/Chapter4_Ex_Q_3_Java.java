package com.ravi.harry;

import java.util.Scanner;

public class Chapter4_Ex_Q_3_Java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you income ");

        double  userIncome = sc.nextInt();

        if(userIncome > 250000 && userIncome < 500000 ){
            calIncomePercentage(userIncome, 5.0);
        }
        else if(userIncome > 500000 && userIncome < 1000000 ){
            calIncomePercentage(userIncome,20);
        }
        else if(userIncome > 1000000){
            calIncomePercentage(userIncome, 30);
        }
        else{
            System.out.println("NO tan for below 2.5 L " + userIncome);
        }

    }

    public static void  calIncomePercentage(double  imcome , double  taxPercentage){

            double calPercentage = (imcome /100) * taxPercentage;
            System.out.println(taxPercentage + " % is " + calPercentage);
    }
}
