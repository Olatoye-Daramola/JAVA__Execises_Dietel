public class SquareOfAsterisks {
    public static void squareOfAsterisks(int numberOfSides) {
        for (int row = 0; row < numberOfSides; row++) {
            for (int column = 0; column < numberOfSides; column++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squareOfAsterisks(6);
    }
}
