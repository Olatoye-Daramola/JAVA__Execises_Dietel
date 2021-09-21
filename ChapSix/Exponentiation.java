public class Exponentiation {
    public static int integerPower(int base, int exponent) {
        int init = 1;
        int power = base;
        while (init < exponent) {
            power *= base;
            init++;
        }
        return power;
    }

    public static void main(String[] args) {
        System.out.println(integerPower(3, 4));
    }
}
