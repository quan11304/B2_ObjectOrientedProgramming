package C5_E15.Control;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import C5_E15.Model.*;

public class Output {
    public static void Output() throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("C5_E15.txt");
        ObjectInputStream i = new ObjectInputStream(fi);

        ArrayList<Course> c = new ArrayList<>();
        c.add((Course) i.readObject());
        c.add((Course) i.readObject());

        for (Course course:c) {
            System.out.println(course);
        }

        i.readObject();

        Student s = (Student) i.readObject();
        System.out.println(s);

        ArrayList<Mark> m = new ArrayList<>();
        m.add((Mark) i.readObject());
        m.add((Mark) i.readObject());

        double sumMid = 0;
        double sumFin = 0;
        int count= 0;
        for (Mark mark : m) {
//            Only considering marks of student s
            if (mark.getStudent() == s) {
                sumMid += mark.getMid();
                sumFin += mark.getFin();
                count++;
            }
        }
        if (sumFin/count >= 10 && sumMid/count > 7) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Retake");
        }
    }

}
