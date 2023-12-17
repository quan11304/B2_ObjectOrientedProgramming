public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double d = Math.sqrt(x*x+y*y);
        System.out.printf("Distance between (%d,%d) and (0,0) is %f",x,y,d);
    }
}
