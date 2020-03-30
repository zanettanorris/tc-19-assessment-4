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
//    String[] str = new String[n];

        String temp;
        String[] list = new String[n+1];
        int k=0;
        for(int i=0;i<string.length();i++){
            for(int j=1;j<=(string.length()-i);j++){
                temp = string.substring(i,i+j);
//                for (int l=0; l<k-1; l++)
//                if (temp != list[l])
                list[k++]=temp;
//        else k++;
            }}
                return list;}
//String[] newArray = new String[n];
//        for (int m = 0; m < list.length; m++) {
//            for(int l = 0; l < m; l++) {
//                if(list[m] == list[l]) {
//                }
//            }
//           newArray[m]=list[m];}
//            return newArray;
//        }
////        static void subString(char str[], int n) {
//            // Pick starting point
//            for (int len = 1; len < string.length(); len++) {
//                // Pick ending point
//                for (int i = 0; i <= string.length() - len; i++) {
//                    //  Print characters from current
//                    // starting point to current ending
//                    // point.
//                    int j = i + len - 1;
//                    for (int k = i; k <= j; k++) {
//
//                    }
//
//                }}return null;
//    }
    public static Integer getNumberOfSubStrings(String input){
                    Integer n = input.length();
                    return ((n * (n + 1) / 2)-1);
                }
    }

