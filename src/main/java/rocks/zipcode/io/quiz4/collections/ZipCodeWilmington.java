package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    Boolean enroll = false;
    Map<Student,Double> studyMap;

    public ZipCodeWilmington() {
        studyMap = new TreeMap<>();
    }

    public void enroll(Student student) {
       student.setEnrolled(true);
    }

    public Boolean isEnrolled(Student student) {

        return student.getEnrolled();
    }

    public void lecture(double numberOfHours) {

    }

    public Map<Student, Double> getStudyMap() {
        return null;
    }
}
