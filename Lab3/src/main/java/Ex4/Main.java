import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
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

            Employee e = new Employee(id,name,dep,basic,extra);

            try {
                PrintWriter out = new PrintWriter(new FileWriter("employees.txt"));
                out.write(e.toString());
                out.close();
            }
            catch (IOException err) {
                err.printStackTrace();
            }
        }
    }
}
