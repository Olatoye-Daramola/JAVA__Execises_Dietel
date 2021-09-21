public class Hypotenuse {
    private static double hypotenuseFinder (double side1, double side2) {
        return Math.hypot(side1, side2);
    }

    public static void main(String[] args) {
        System.out.println(hypotenuseFinder(3.0, 4.0));
    }
}
