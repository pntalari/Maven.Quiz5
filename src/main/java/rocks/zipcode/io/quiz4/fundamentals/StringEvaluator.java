package rocks.zipcode.io.quiz4.fundamentals;

import java.awt.print.Pageable;
import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> subStr = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                subStr.add(string.substring(i, j));
            }
        }

        return subStr.toArray(new String[subStr.size()]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> str1Sub = Arrays.asList(getAllSubstrings(string1));
        List<String> str2Sub = Arrays.asList(getAllSubstrings(string2));

        Set<String> retStr = new HashSet<>();

        for (int i = 0; i < str2Sub.size(); i++) {
            if (str1Sub.contains(str2Sub.get(i))){
                retStr.add(str2Sub.get(i));
            }
        }
        return retStr.toArray(new String[retStr.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        List<String> strCommon = Arrays.asList(getCommonSubstrings(string1,string2));
        String max = Collections.max(strCommon,Comparator.comparing(String::length));

        return max;
    }
}
