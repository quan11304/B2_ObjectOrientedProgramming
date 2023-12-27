public class S13_E18 {
    public static void main(String[] args) {
        int n = 100000;
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + 1.0 / (i * i);
        System.out.println(sum);
    }
}
