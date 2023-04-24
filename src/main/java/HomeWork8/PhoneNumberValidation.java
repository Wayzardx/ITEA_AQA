package main.java.HomeWork8;

import java.util.regex.Pattern;

public class PhoneNumberValidation {
    private static final String PhoneNumberRegex = "^\\+380\\d{9}$";
    private static final Pattern PATTERN = Pattern.compile(PhoneNumberRegex);

    public static void main(String[] args) {
        String phoneNumber = "+380932194875";
        if (PhoneNumberValidation.isValid(phoneNumber)) {
            System.out.println("True valid number");
        } else {
            System.out.println("False valid number");
        }
    }

    public static boolean isValid(String phoneNumber) {
        return PATTERN.matcher(phoneNumber).matches();
    }
}
