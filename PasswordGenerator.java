package com.project;
import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?";

       public static void main(String[] args) {
           int length = 12;
           System.out.println(generateRandomPassword(length));
           }
         public static String generateRandomPassword(int length) {
            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();

            String allCharacters = CHAR_UPPER + CHAR_LOWER + DIGITS + SPECIAL_CHARS;

            for (int i = 0; i < length; i++) {
                 int randomIndex = random.nextInt(allCharacters.length());
                 char randomChar = allCharacters.charAt(randomIndex);
                 password.append(randomChar);
            }
           return password.toString();
    }
}