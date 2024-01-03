public class Kary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // Second argument is the base to be converted into (K)
        int k = Integer.parseInt(args[1]); // First argument is the base-10 number to be converted into base-K

        // set power to the largest power of k that is <= n
        int power = 1;
        while (power <= n / k) {
            power *= k;
        }

        // check for presence of powers of k in n, from largest to smallest
        while (power > 0) {
            int temp = n/power;
			if (temp <10) 
				System.out.print(temp);
			else
				System.out.print((char)(temp+54)); // ASCII character
			n -= temp*power;
            power /= k;
        }

        System.out.println();
    }
}
