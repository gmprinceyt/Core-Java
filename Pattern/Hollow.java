/**
 * ? Hello Ractangele Pattern Look like
 *  *  *  *  * 
 *           * 
 *           * 
 *           * 
 *  *  *  *  * 
 */


public class  Hollow  {
    
    public static void HollowRectangle(int rows, int cols){
        for (int row = 1; row <= rows; row++){
            for(int col = 1; col <= cols; col++ ){
                if (col==1 || row== 1 || row == rows || col == cols){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            };
            System.out.println();
        };
    };
        public static void HollowSolidRhombus(int n ){
        for (int row = 1; row <= n; row++){
            //space 
            for (int j = 1; j <= n-row; j++){
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= n; j++){
                if (row == 1 || row == n || j == 1|| j== n){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            };
            System.out.println();
        }
    }

    public static void main(String args[]){
        HollowRectangle(4, 5);
        HollowSolidRhombus(5)
    };
};
