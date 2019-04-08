package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer studID;
    Double hoursLearnt;
    Boolean isEnrolled;

    public Student() {
       this(null);
    }

    public Student(Integer id) {
        this.studID = id;
        this.hoursLearnt = 0.0;
        this.isEnrolled = false;
    }

    public void learn(Double amountOfHours) {
        this.hoursLearnt += amountOfHours;
    }

    public Double getTotalStudyTime() {

        return this.hoursLearnt;
    }

    public Integer getStudID() {
        return studID;
    }

    public void setStudID(Integer studID) {
        this.studID = studID;
    }

    public Double getHoursLearnt() {
        return hoursLearnt;
    }

    public void setHoursLearnt(Double hoursLearnt) {
        this.hoursLearnt += hoursLearnt;
    }

    public Boolean getEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        isEnrolled = enrolled;
    }
}
