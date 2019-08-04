package com.stackroute.javakeywords.numberandstring;

public class StringApplication {
    public static void main(String[] args) {
        String stringInput = "samaresh maiti";

        // Returns the number of characters in the String.
        System.out.println("length of the string = " + stringInput.length());

        // Returns the character at ith index.
        System.out.println("Character at 5rd position = " + stringInput.charAt(5));

        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring of the string" + stringInput.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + stringInput.substring(2, 5));

        // Concatenates string2 to the end of string1.
        String string1 = "sabang";
        String string2 = "eral";
        System.out.println("Concatenated string  = " + string1.concat(string2));

        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "learn how to coding";
        System.out.println("Index of Share " + s4.indexOf("to"));

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s4.indexOf('a', 3));

        // Checking equality of Strings
        Boolean comparisonResult = "samaresh".equals("Samaresh");
        System.out.println("Checking Equality  " + comparisonResult);


        comparisonResult = "Maiti".equalsIgnoreCase("maiti ");
        System.out.println("Checking Equality " + comparisonResult);

        // Converting cases
        String stringCaseInput = "SamaResh";
        System.out.println("Changing to lower Case " + stringCaseInput.toLowerCase());
        System.out.println("Changing to UPPER Case " + stringCaseInput.toUpperCase());

        // Replacing characters
        String str1 = "samareshmaiti";
        System.out.println("Original String " + str1);
        String str2 = str1.replace('s', 'm');

    }
}


