public class StringApplication {
    public static void main (String[] args)
        {
            String string= "samaresh maiti";

            // Returns the number of characters in the String.
            System.out.println("length of the string = " + string.length());

            // Returns the character at ith index.
            System.out.println("Character at 5rd position = "
                    + string.charAt(5));

            // Return the substring from the ith  index character
            // to end of string
            System.out.println("Substring of the string" + string.substring(3));

            // Returns the substring from i to j-1 index.
            System.out.println("Substring  = " + string.substring(2,5));

            // Concatenates string2 to the end of string1.
            String s1 = "sabang";
            String s2 = "eral";
            System.out.println("Concatenated string  = " +
                    s1.concat(s2));

            // Returns the index within the string
            // of the first occurrence of the specified string.
            String s4 = "learn how to coding";
            System.out.println("Index of Share " +
                    s4.indexOf("to"));

            // Returns the index within the string of the
            // first occurrence of the specified string,
            // starting at the specified index.
            System.out.println("Index of a  = " +
                    s4.indexOf('a',3));

            // Checking equality of Strings
            Boolean out = "samaresh".equals("Samaresh");
            System.out.println("Checking Equality  " + out);


            out = "Maiti".equalsIgnoreCase("maiti ");
            System.out.println("Checking Equality " + out);

            // Converting cases
            String word1 = "SamaResh";
            System.out.println("Changing to lower Case " +
                    word1.toLowerCase());
            // Converting cases
            System.out.println("Changing to UPPER Case " +
                    word1.toUpperCase());

            // Replacing characters
            String str1 = "samareshmaiti";
            System.out.println("Original String " + str1);
            String str2 = str1.replace('s' ,'m') ;

        }
    }


