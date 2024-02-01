package C5_E15.Control;

import C5_E15.Model.*;

import java.io.*;
import java.util.Scanner;

public class Input {
    public static void Input() throws IOException {
        Scanner scan = new Scanner(System.in);
        Course c1 = new Course(1,"Maths");
        Course c2 = new Course(2,"Phys");
        Lecturer l = new Lecturer(2,"Nick");
        Student s = new Student(3,"Emmett");

        System.out.printf("\nMidterm Mark for %s: ",c1.getName());
        double mid = scan.nextDouble();
        System.out.printf("\nFinal Mark for %s: ",c1.getName());
        double fin = scan.nextDouble();
        Mark m1 = new Mark(c1,s,mid,fin);

        System.out.printf("\nMidterm Mark for %s: ",c2.getName());
        mid = scan.nextDouble();
        System.out.printf("\nFinal Mark for %s: ",c2.getName());
        fin = scan.nextDouble();
        Mark m2 = new Mark(c2,s,mid,fin);

        FileOutputStream fo = new FileOutputStream("C5_E15.txt");
        ObjectOutputStream o = new ObjectOutputStream(fo);
        o.writeObject(c1);
        o.writeObject(c2);
        o.writeObject(l);
        o.writeObject(s);
        o.writeObject(m1);
        o.writeObject(m2);
    }
}
