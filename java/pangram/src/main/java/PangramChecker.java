public class PangramChecker {

    public static boolean isPangram(String input) {
        // ASCII codes for A-Z are 65-90
        // sum of these is 2015
        input = input.toUpperCase();

        boolean[] used = new boolean[26];
        for(char c : input.toCharArray()) {
            if (c >= 65 && c <= 90) used[c - 65] = true;
        }

        for(boolean b : used) {
            if (b == false) return false; 
        }

        return true;
    }

}
