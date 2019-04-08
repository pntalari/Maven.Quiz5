package rocks.zipcode.io.quiz4.fundamentals;

import java.sql.Array;
import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> subStr = Arrays.asList(StringEvaluator.getAllSubstrings(string));
        List<String> retStr = new ArrayList<>();

        for (int i = 0; i <subStr.size() ; i++) {
            if(isPalindrome(subStr.get(i))){
                retStr.add(subStr.get(i));
            }
        }

        return retStr.toArray(new String[retStr.size()]);

    }

    public static Boolean isPalindrome(String string) {
        if (string.equals(reverseString(string)))
            return true;
        else
            return false;
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder();
        builder.append(string, 0, string.length());
        String reversed = builder.reverse().toString();

        return reversed;
    }
}
