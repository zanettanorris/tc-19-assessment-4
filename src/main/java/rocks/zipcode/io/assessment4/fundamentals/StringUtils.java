package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(indexToCapitalize, Character.toUpperCase(sb.charAt(indexToCapitalize)));
        return (sb.toString());
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
       return (characterToCheckFor.equals(baseString.charAt(indexOfString)));
    }

    public static String[] getAllSubStrings(String string) {
        Integer n = StringUtils.getNumberOfSubStrings(string);
    String[] str = new String[n];
//        static void subString(char str[], int n) {
            // Pick starting point
            for (int len = 1; len < string.length(); len++) {
                // Pick ending point
                for (int i = 0; i <= string.length() - len; i++) {
                    //  Print characters from current
                    // starting point to current ending
                    // point.
                    int j = i + len - 1;
                    for (int k = i; k <= j; k++) {

                    }

                }}return null;
    }
    public static Integer getNumberOfSubStrings(String input){
                    Integer n = input.length();
                    return ((n * (n + 1) / 2)-1);
                }
    }

