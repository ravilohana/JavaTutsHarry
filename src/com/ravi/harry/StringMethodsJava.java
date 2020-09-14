package com.ravi.harry;

public class StringMethodsJava {
    public static void main(String[] args) {

        String myName = "Ravi Lohana";
        int len = myName.length();
        System.out.println(len);
        System.out.println("Lower case string method: " + myName.toLowerCase());
        System.out.println("Upper  case string method: " + myName.toUpperCase());
        String sampleStr = "      HI trim the  string        ";
        System.out.println(sampleStr);
        // trim() :  This method may be used to trim whitespace (as defined above) from the beginning and end of a string.
        System.out.println("Trim sampleString means remove all spaces " + sampleStr.trim());

        //  substring(start-point, end-point)
        // include start-point but exclude end-point , not take end-point charaters
        System.out.println(myName.substring(1)); // avi lohana
        System.out.println(myName.substring(6,11)); // ohana
        //System.out.println(myName.substring(6,12)); // Here StringIndexOutOfBoundsException will occur as length is 11


        System.out.println(myName.startsWith("R")); // returns boolean values as true
        System.out.println(myName.endsWith("a"));  // returns boolean values as true

        System.out.println(myName.replace('R', 'V')); // replace char only in a given string
        System.out.println(myName.replace("Ravi","Monday")); //replace string

        System.out.println(myName.charAt(0));  // return char at position 0
        System.out.println(myName.indexOf('V')); // return index no of a given char , if not present -1 will be return
        System.out.println(myName.indexOf('a',2)); // return index no of a given char , if not present -1 will be return

        String newStr = "India";
        System.out.println(newStr.equals("India")); // equals() compare string with given string , compare lowercase and uppercase also
        System.out.println(newStr.equalsIgnoreCase("india")); // compare string and ignore the uppercase and lowercase



    }
}
