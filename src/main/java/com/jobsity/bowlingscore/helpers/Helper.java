package com.jobsity.bowlingscore.helpers;

public class Helper {
    public static Integer numberValue(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}
