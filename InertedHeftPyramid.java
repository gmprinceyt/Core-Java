
public class InertedHeftPyramid {

    public static void InertedAndRotatedHeftPyramid(int row) {

        //           * 
        //        *  * 
        //     *  *  * 
        //  *  *  *  * 
        // rows
        for (int i = 1; i <= row; i++) {
        //cols
            //spaces
            for (int k = row - i; k >= 1; k--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
            //print 
                System.out.print(" * ");
            }
            System.out.println();
        }
    };

    public static void InertedHeftPyramidWithNumber(int row){
        // 12345
        // 1234
        // 123
        // 12
        // 1
        for (int i = row; i >= 1;  i--){
            //inner loop 
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // InertedAndRotatedHeftPyramid(4);
        InertedHeftPyramidWithNumber(5);
    };   
}
