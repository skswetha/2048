public class TriangleDrawer2 {

    public static void main(String[] args) {
        int size = 10;
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < size - i; j++) {
           }
           for (int k = 0; k <= i; k++) {
               System.out.print("*");
           }
           System.out.println();
       }

    }

}