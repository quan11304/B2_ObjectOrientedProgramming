package C5_E15.Control;

import C5_E15.Model.Course;
import C5_E15.Model.Lecturer;
import C5_E15.Model.Mark;
import C5_E15.Model.Student;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int choice = 1;
        while (choice != 0) {
            System.out.println("1. Input - 2. Output - 0. Exit");
            System.out.print("Choice: ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch(choice) {
                case 1:
                    Input.Input();
                    break;
                case 2:
                    Output.Output();
                    break;
                default:
                    System.out.println("Please try again");
            }
            System.out.println();
        }

    }
}
