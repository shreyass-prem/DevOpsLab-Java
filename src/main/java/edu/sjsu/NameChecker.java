package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // TODO: implement
        if (input.length() < 2 || input.length() > 40) {
            return false;
        }

        if (input.charAt(0) == '-' || input.charAt(0) == '\'') {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i)) && input.charAt(i) != '-' && input.charAt(i) != '\'') {
                return false;
            }

            if (i > 0 && (input.charAt(i) == '-' || input.charAt(i) == '\'')) {
                if (input.charAt(i - 1) == '-' || input.charAt(i - 1) == '\'') {
                    return false;
                }
            }
        }

        return true;
    }
}
