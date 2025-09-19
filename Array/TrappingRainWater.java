public class TrappingRainWater {


    // {4,2,0,6,3,2,5};
    public static void Solution(int arr[]){
        /**
         * Psueso Code
         * Find MaxLeftSideElement , MaxRigthSideElment
         * calculate of Sum of Trapped Water  (W-H)
         */
        int mLeft[] = new int[arr.length];
        int mRight[] = new int[arr.length];

        // MaxLeftSideElement
        mLeft[0] = arr[0];
        for (int m = 1; m < mLeft.length; m++ ){
            // Formula - max(leftMaximumElment, currentElement);
            mLeft[m] = Math.max(mLeft[m-1], arr[m]); 
        };

        // MaxRightSideElment
        mRight[mRight.length-1] = arr[arr.length-1];
        for (int m = mRight.length-2; m >= 0; m--){
            // Formula - max(RightMaximumElment, currentElement);
            mRight[m] = Math.max(mRight[m+1], arr[m]);
        };

        // calculate of Sum of TrappedWater
        int trappedWater = 0; 
        for (int t = 0; t < arr.length; t++){
            // Water Level
            int w  = Math.min(mLeft[t], mRight[t]);
            trappedWater += (w - arr[t]);
        };
        System.out.print("Total Trapped Water: "+ trappedWater);
    }

    public static void main(String args []){
        int arr[] = {4,2,0,6,3,2,5};
        Solution(arr);
    }
}