public class SumOfSines {
    public static void main(String[] args) {
        double degree = Double.parseDouble(args[0]);
        double radian = Math.toRadians(degree);
        double result = Math.sin(2 * radian) + Math.sin(3 * radian);
        System.out.println(result);
    }
}
