package com.ravi.harry;

public class Chapter_3_Exe_String {
    public static void main(String[] args) {
        // convert  string to lowercase

        String myStr = "This is new string 0001";
        System.out.println(myStr.toLowerCase());

        System.out.println(myStr.replace(" " , "_"));

        String myName = "Ravi Lohana";
        System.out.println("Dear ," + myName + " " + "Thanks a Lot !!!!!!");

        String letter = "Dear  <|name|>, Thanks A lot !!!!";
        System.out.println(letter.replace("<|name|>", myName));
        System.out.println(letter.replace("<|name|>", "Lohana ravi"));

        String sampleSpaceString = "Hi  I am    Raj";
        System.out.println(sampleSpaceString.indexOf("  "));
        System.out.println(sampleSpaceString.indexOf("   "));

        String myLetter = "Dear Ravi , \n\tThis Java Course is Nice. \n\tThanks!!!!";
        System.out.println(myLetter);


    }




}
