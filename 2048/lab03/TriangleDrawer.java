public class TriangleDrawer {

    public static void main(String[] args) {
        int row = 0;
        int SIZE = 10;

        while (row < SIZE) {
            int col = 0;
            row = row + 1;
            while (col < row) {
                col = col + 1;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}