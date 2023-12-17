public class Hellos {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        for (int i = 1; i <= number; i++) {
            System.out.print(i);
            if(i%10==1 && i%100!=11) System.out.print("st");
            else if(i%10==2 && i%100!=12) System.out.print("nd");
            else if(i%10==3 && i%100!=13) System.out.print("rd");
            else System.out.print("th");
            System.out.println(" Hello");
        }
    }
}
