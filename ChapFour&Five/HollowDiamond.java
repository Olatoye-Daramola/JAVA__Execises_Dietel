public class HollowDiamond {
    public static void hollowShape(int sizeOfDiamond) {
        for (int row = 0; row < sizeOfDiamond; row++) {
            leftToRight(sizeOfDiamond, row, 1);
            rightToLeft(sizeOfDiamond, row, 1);
            System.out.println();
        }

        for (int row = 1; row < sizeOfDiamond; row++) {
            rightToLeft(sizeOfDiamond, row, 0);
            leftToRight(sizeOfDiamond, row, 2);
            System.out.println();
        }
    }

    private static void rightToLeft(int sizeOfDiamond, int row, int i) {
        for (int column = i; column < sizeOfDiamond; column++) {
            if (row == column) System.out.print("*  ");
            else System.out.print("  ");
        }
    }

    private static void leftToRight(int sizeOfDiamond, int row, int i) {
        for (int column2 = sizeOfDiamond - i; column2 >= 0; column2--) {
            if (row == column2) System.out.print("*  ");
            else System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        hollowShape(5);
    }
}