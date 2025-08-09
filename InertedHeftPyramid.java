
public class InertedHeftPyramid {

    public static void InertedAndRotatedHeftPyramid(int row) {
        // rows
        for (int i = 1; i <= row; i++) {
            //cols
            //spaces
            for (int k = row - i; k >= 1; k--) {
                System.out.print("_");
            }
            for (int j = 1; j <= i; j++) {
                //print 
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        InertedAndRotatedHeftPyramid(4);
    };   
}
