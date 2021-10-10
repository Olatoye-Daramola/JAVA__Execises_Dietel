public class HollowDiamond {
    public static void hollowShape(int sizeOfDiamond) {
        for (int row = 0; row < sizeOfDiamond; row++) {
            rightToLeftDiagonal(sizeOfDiamond, row, 1);
            leftToRightDiagonal(sizeOfDiamond, row, 1);
            System.out.println();
        }

        for (int row = 1; row < sizeOfDiamond; row++) {
            leftToRightDiagonal(sizeOfDiamond, row, 0);
            rightToLeftDiagonal(sizeOfDiamond, row, 2);
            System.out.println();
        }
    }

    private static void leftToRightDiagonal(int sizeOfDiamond, int row, int startPoint) {
        for (int column = startPoint; column < sizeOfDiamond; column++) {
            if (row == column) System.out.print("*  ");
            else System.out.print("  ");
        }
    }

    private static void rightToLeftDiagonal(int sizeOfDiamond, int row, int startPoint) {
        for (int column2 = sizeOfDiamond - startPoint; column2 >= 0; column2--) {
            if (row == column2) System.out.print("*  ");
            else System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        hollowShape(5);
    }
}