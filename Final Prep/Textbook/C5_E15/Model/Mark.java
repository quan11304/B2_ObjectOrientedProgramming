package C5_E15.Model;

import java.io.Serializable;

public class Mark implements Serializable {
    private Course course;
    private Student student;
    private double mid;
    private double fin;

    public Mark(Course course, Student student, double mid, double fin) {
        this.course = course;
        this.student = student;
        this.mid = mid;
        this.fin = fin;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }
}
