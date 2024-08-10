public class Search {

    public static int countDigits(String string) {
        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                countDigits++;
            }
        }
        return countDigits;
    }

    public static int countLetters(String string) {
        int countLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                countLetters++;
            }
        }
        return countLetters;
    }

    public static int countSpaces(String string) {
        int countSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i))) {
                countSpaces++;
            }
        }
        return countSpaces;
    }
}

