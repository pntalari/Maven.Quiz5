package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington  {

    Map<Student, Double> studyMap;

    public ZipCodeWilmington() {
        studyMap = new LinkedHashMap<>();
        studyMap.clear();

    }

    public void enroll(Student student) {
        studyMap.put(student, student.getTotalStudyTime());
        student.setIsEnrolled(true);
    }

    public Boolean isEnrolled(Student student) {
        return student.getIsEnrolled();
    }

    public void lecture(double numberOfHours) {
        for (Map.Entry<Student, Double> entry : studyMap.entrySet()) {
            entry.setValue(numberOfHours);
            entry.getKey().setHoursLearnt(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        for (Map.Entry<Student, Double> entry : studyMap.entrySet()) {
            entry.setValue(entry.getKey().getTotalStudyTime());
        }
        return studyMap;
    }

}
