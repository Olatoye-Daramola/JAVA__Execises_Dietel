public class SquareOfAnyCharacter {
    public static void squareOfAnyCharacter(int numberOfSides, char fillCharacter) {
        for (int row = 0; row < numberOfSides; row++) {
            for (int column = 0; column < numberOfSides; column++) {
                System.out.print(fillCharacter + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squareOfAnyCharacter(4, '$');
    }
}
