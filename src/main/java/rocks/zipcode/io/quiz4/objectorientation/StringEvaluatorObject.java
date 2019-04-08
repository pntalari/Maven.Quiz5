package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String strObj;

    public StringEvaluatorObject(String str) {
        strObj = str;
    }

    public String[] getAllSubstrings() {
        return StringEvaluator.getAllSubstrings(strObj);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(strObj,secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(strObj,secondInput);
    }
}
