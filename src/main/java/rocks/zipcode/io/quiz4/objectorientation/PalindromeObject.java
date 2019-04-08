package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    String arrObj;

    public PalindromeObject(String input) {
        arrObj = input;
    }

    public String[] getAllPalindromes() {
        String[] retObj = PalindromeEvaluator.getAllPalindromes(arrObj);

        return retObj;
    }

    public Boolean isPalindrome() {
        return PalindromeEvaluator.isPalindrome(arrObj);
    }

    public String reverseString() {
        return PalindromeEvaluator.reverseString(arrObj);
    }
}
