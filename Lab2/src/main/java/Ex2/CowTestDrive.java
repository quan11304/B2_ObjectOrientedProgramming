public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow = new Cow("Vache","Ox",5);
        System.out.println(cow.getAge());
        cow.setAge(4);
        System.out.println(cow.getAge());
        cow.moo();
    }
}
