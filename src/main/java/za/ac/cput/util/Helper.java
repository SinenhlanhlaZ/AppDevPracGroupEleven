package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    public static String generateID() {
        return UUID.randomUUID().toString();
    }

    public static boolean isNullorEmpty(String s){
        return(s == null || s.isEmpty() || s.equalsIgnoreCase("null"));

    }
}
