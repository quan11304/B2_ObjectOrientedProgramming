import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of employees: ");
        int n = scan.nextInt();
        scan.nextLine();

        FileOutputStream fo = new FileOutputStream("employees.txt");
        ObjectOutputStream o = new ObjectOutputStream(fo);

        for (int i = 0; i < n; i++) {
            System.out.print("ID: ");
            String id = scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Department: ");
            String dep = scan.nextLine();
            System.out.print("Basic salary: ");
            int basic = scan.nextInt();
            System.out.print("Extra salary: ");
            int extra = scan.nextInt();
            scan.nextLine();

            Employee e = new Employee(id, name, dep, basic, extra);

            try {
                o.writeObject(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        // Reading from file
        ArrayList<Employee> arr = new ArrayList<>();
        FileInputStream fi = new FileInputStream("employees.txt");
        ObjectInputStream i = new ObjectInputStream(fi);
        arr.add((Employee) i.readObject());

        // Printing from array
        for (Employee e : arr) {
            System.out.println(e.toString());
        }
    }
}
