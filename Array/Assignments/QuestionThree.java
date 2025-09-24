class QuestionThree {
    /**
     * Analize - what have to do.
     * 1. find each position of left and right side maximum height of arr; 
     * 2. fint trap water value using trap  -  height - min(left ,right);
     */

    public static int Answer(int height[]){
        // array length;
        int length  = height.length;
        // Fint Each position of left side max value;
        int maxLeft[] = new int[length]; 
           maxLeft[0] = height[0];
        for (int i = 1; i <  length; i++){
            if (maxLeft[i-1] < height[i]){
                maxLeft[i] = height[i];
            } else  {
                maxLeft[i] = maxLeft[i-1];
            }
        };

        // find Each position of right side max values;
        int maxRight[] = new int[length];
        maxRight[maxRight.length-1] = height[length-1];
        for (int i = length - 2; i >= 0;  i-- ){
            if (maxRight[i+1] < height[i]){
                maxRight[i]  = height[i];
            }else {
                maxRight[i] = maxRight[i+1];
            }
        };
        // fint trap water value using trap  -  height - min(left ,right);
        int traped = 0 ;
        for (int i = 0; i  < length; i++){
            int min = Math.min(maxLeft[i],maxRight[i]);
            traped +=  min - height[i];             
        };
        return traped;
    }   
     public static void main(String args[]){
        int arr[] = {4,2,0,3,2,5};
        int res  = Answer(arr);
        System.out.print(res);
     }
}