package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    String delim;
    String strList;

    public StringAssembler(Character delimeter) {
        this.delim = delimeter.toString();
        strList = "";
    }

    public StringAssembler append(String str) {
        strList += str;
        strList += this.delim;
        return this;
    }

    public String assemble() {

        return strList.substring(0,strList.length()-1);
    }
}
