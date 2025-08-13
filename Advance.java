public class Advance {
    public static void ButterFly(int n ){
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        for (int row = 1; row <= n; row++ ){

            //start
            for (int j = 1; j <= row; j++){ 
                System.out.print("*");
            };

            //space
            for (int j = 1; j <= 2*(n-row); j++ ){
                System.out.print(" ");
            };

            //start
            for (int j = 1; j <= row; j++){ 
                System.out.print("*");
            };
            System.out.println();
        }
        for (int row = n; row >= 1; row-- ){
           //start
            for (int j = 1; j <= row; j++){ 
                System.out.print("*");
            };

            //space
            for (int j = 1; j <= 2*(n-row); j++ ){
                System.out.print(" ");
            };

            //start
            for (int j = 1; j <= row; j++){ 
                System.out.print("*");
            };
            System.out.println();
        }
    };

    public static void SolidRhombus(int n){
        for (int row = 1; row <= n; row++){
            //space 
            for (int j = 1; j <= n-row; j++){
                System.out.print("  ");
            }
            //start
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            };
            System.out.println();
        }
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


    public static void main(String ags []){
        // ButterFly(3);
        // SolidRhombus(5);
        HollowSolidRhombus(5);
        
    }
}