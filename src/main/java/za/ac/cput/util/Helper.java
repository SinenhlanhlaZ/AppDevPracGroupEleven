package za.ac.cput.util;
/*
    Helper.java
    Helper class to optimize code
    Author: Fayaad Abrahams (218221630)
    Date: 31 March 2022
*/

import java.util.Random;

public class Helper {
    // Creates a shorter alphanumeric sequence instead of the long UUID random method.
    public static String generateID() {
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public static boolean isNullorEmpty(String s) {
        return (s == null || s.isEmpty() || s.equalsIgnoreCase("null"));

    }
}
