package rocks.zipcode.io.assessment4.fundamentals;

import java.util.Arrays;
import java.util.LinkedHashSet;

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
        String temp;
        String[] list = new String[n + 1];
        int k = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= (string.length() - i); j++) {
                temp = string.substring(i, i + j);
                list[k++] = temp;
            }
        }
//from javacodeexamples:
        LinkedHashSet<String> newList = new LinkedHashSet<String>(Arrays.asList(list));
        String[] newArray = newList.toArray(new String[newList.size()]);
        return newArray;
    }

    public static Integer getNumberOfSubStrings(String input) {
        Integer n = input.length();
        return ((n * (n + 1) / 2) - 1);
    }
}

