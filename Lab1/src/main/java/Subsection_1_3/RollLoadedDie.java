public class RollLoadedDie {
    public static void main(String[] args) {
        int dice = (int) (Math.random() * 8) +1;
        System.out.println(dice);
        if (dice >= 6 && dice <= 8)
            System.out.println(6);
        else System.out.println(dice);
    }
}
