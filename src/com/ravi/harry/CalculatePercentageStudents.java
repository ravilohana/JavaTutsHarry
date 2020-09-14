package com.ravi.harry;


import java.util.Scanner;

// Exercise 1 : calculate the percentage of the given student . his marks from 5 subjects  , and inout is taken from the keyboard (marks are out of 100)
public class CalculatePercentageStudents {

    public static void main(String[] args) {
//        int totalSubject = 5;
//        int totalOutOfMarks = totalSubject * 100 ;
//        Scanner subjectMarks  = new Scanner(System.in);
//        System.out.println("Enter the English out of 100");
//        float   englishMarks = subjectMarks.nextFloat();
//        System.out.println("Enter the Hindi out of 100");
//        float  hindiMarks = subjectMarks.nextFloat();
//        System.out.println("Enter the Maths out of 100");
//        float  mathsMarks = subjectMarks.nextFloat();
//        System.out.println("Enter the Social Science out of 100");
//        float  socialScienceMarks = subjectMarks.nextFloat();
//        System.out.println("Enter the Science out of 100");
//        float  scienceMarks = subjectMarks.nextFloat();
//
//        float totalSubjectMarks = englishMarks + hindiMarks + mathsMarks + socialScienceMarks + scienceMarks ;
//
//        float calPercentage =  ( totalSubjectMarks / totalOutOfMarks ) * 100 ;
//
//        System.out.println("Percentage of a student is: " + calPercentage);

        // change km to miles
        System.out.println("Enter the KM");
        Scanner sc = new Scanner(System.in);
        double userInputKM = sc.nextDouble();
        double oneMile = 0.611371;
        double convsersionKMToMile = userInputKM * oneMile;
        System.out.println(convsersionKMToMile + "Miles");

    }


}

