
public class Pyramid {

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

    public static void FLODYSTriangle(int n ){
            // 1 
            // 2 3
            // 4 5 6
            // 7 8 9 10
            // 11 12 13 14 15
        int count = 1;
        for (int i = 1; i <= n; i++){
            //inner Loop
            for (int j = 1; j <= i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    };

    
    public static void Zero_One_Triangle(int n){
                // 1
                // 01
                // 101
                // 0101
                // 10101
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                if ((row + col)%2 == 0){
                System.out.print(1);
                }else {
                System.out.print(0);
                }
            }
            System.out.println(); 
        }
    }

    public static void DIAMOND_PATTERN(int n ){
        // Upper Part of Diamound
        for(int row = 1; row <= n; row++){
            //space 
            for (int j = 1; j <= n-row; j++){
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= (2*row)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
                // Lower Part of Diamound
        for (int row = n; row >= 1; row--){
            //space 
            for (int j = 1; j <= n-row; j++){
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= (2*row)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void NumberPyramid(int n ){
        for (int row = 1; row <= n; row++){
            //space
            for (int j= 1; j <= n-row; j++){
                System.out.print(" ");
            }
            //star
            for (int j= 1; j <= (2*row)-1; j++){
                System.out.print(row);
            }
            System.out.println();
        };
    };


    public static void main(String args[]) {
        // InertedAndRotatedHeftPyramid(4);
        // InertedHeftPyramidWithNumber(5);
        // FLODYSTriangle(5);
        // Zero_One_Triangle(5);
        // DIAMOND_PATTERN(5);
        // NumberPyramid(5);

    };   
}
