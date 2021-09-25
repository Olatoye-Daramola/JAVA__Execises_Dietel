public class Multiples {
    public static boolean isMultiple (int firstNumber, int secondNumber) {
        return firstNumber % secondNumber == 0;
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(4, 2));
    }
}
