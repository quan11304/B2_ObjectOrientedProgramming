public class FunctionGrowth {
    public static void main(String[] args) {
        for (int n = 16; n <= 2048; n *= 2) {
            System.out.print((int) Math.log(n));
            System.out.print("\t");
            System.out.print(n);
            System.out.print("\t");
            System.out.print((int) (n * Math.log(n)));
            System.out.print("\t");
            System.out.print((long) n * n);
            System.out.print("\t\t");
            System.out.print((long) n * n * n);
            System.out.println();
        }
    }
}
