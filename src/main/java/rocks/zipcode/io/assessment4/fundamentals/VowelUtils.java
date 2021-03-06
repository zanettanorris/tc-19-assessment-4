package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i<word.length(); i++)
            if (isVowel(word.charAt(i))) {
                return true;}
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String loweredWord = word.toLowerCase();
        for (int index = 0; index < loweredWord.length(); index++) {
            if (isVowel(loweredWord.charAt(index))){
                return index; }
        }
    return -1;
}


    public static Boolean startsWithVowel(String word) {
        return (isVowel(word.charAt(0))) ;

    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'|| character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            return true;
        } else return false;
    }
}
