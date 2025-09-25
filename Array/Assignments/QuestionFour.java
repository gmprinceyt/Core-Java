class QuestionFour {

    public static int BruteForceApproach(int[] arr){
        int maxSum = 0;
        for (int st = 0; st < arr.length; st++){
            int currentSum = 0; 
            for (int en = st; en < arr.length; en++){
                currentSum += arr[en];
                if (currentSum > maxSum) maxSum = currentSum;
            }
        };
        return maxSum;
    };

    public static int OptimazeApproach(int[] arr){
        // Kadane Algorithms
        int maxSum = 0; 
        int currSum = 0;
        for (int i = 0; i < arr.length; i++){
            currSum += arr[i]; 
            if (currSum < 0){
                currSum = 0;
            };
            if (maxSum < currSum) maxSum = currSum;
        }
        return maxSum;
    }
    public static void main(String args[]){
        // 4. Question Find Maximum sum of Sub Array  
        int arr[] = {5,-10,3,3,7};
        // int res  = BruteForceApproach(arr);
        int res = OptimazeApproach(arr);
        System.out.print(res);
    };

}