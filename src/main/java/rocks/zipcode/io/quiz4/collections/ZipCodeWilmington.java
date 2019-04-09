package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    Map<Student, Double> studyMap;

    public ZipCodeWilmington() {
        studyMap = new HashMap<>();
    }

    public void enroll(Student student) {
        studyMap.put(student, student.getTotalStudyTime());
        student.setEnrolled(true);
    }

    public Boolean isEnrolled(Student student) {
        return student.getEnrolled();
    }

    public void lecture(double numberOfHours) {
        for (Map.Entry<Student,Double> entry: studyMap.entrySet()) {
            entry.setValue(numberOfHours);
            entry.getKey().setHoursLearnt(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        return studyMap;
    }

}
