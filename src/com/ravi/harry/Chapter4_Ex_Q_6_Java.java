package com.ravi.harry;

import java.util.Scanner;

public class Chapter4_Ex_Q_6_Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website:");

        String websiteURL = sc.nextLine();

       // String websiteURL = "www.google.in";

        if(websiteURL.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(websiteURL.endsWith(".org")){
            System.out.println("Org website");
        }
        else if(websiteURL.endsWith(".in")){
            System.out.println("indian website");
        }
        else{
            System.out.println("another website");
        }



    }
}
