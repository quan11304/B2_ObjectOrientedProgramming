public class VectorTestDrive {
    public static void main(String[] args) {
        Vector u = new Vector(3,4);
        Vector v = new Vector(2,4);
//        System.out.printf("u(%d,%d)\n",u.getX(),u.getY());

        u.add(v);
//        System.out.printf("u(%d,%d)\n",u.getX(),u.getY());
        u.subtract(v);
//        System.out.printf("u(%d,%d)\n",u.getX(),u.getY());
        System.out.println(u.multiply(v));
    }
}
