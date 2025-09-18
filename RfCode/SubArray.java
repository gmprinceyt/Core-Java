class SubArray {
    public static void PrintSubArray(int arr[]){
        for (int st = 0; st < arr.length; st++){
            for (int en = st;  en < arr.length; en++){
                for (int p = st; p <= en; p++){
                    System.out.print(arr[p]);
                };
                System.out.print(" ");
            };
            System.out.println();
        }
    };
    

    public static void MaxSubArray(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int st = 0; st < arr.length; st++){
            int sum = 0;
            for (int en = st; en < arr.length; en++){
                sum += arr[en];
                if (sum > max) max = sum;
            }
        };
        System.out.print(max);
    };


    public static void MaximumSubArray(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++){
            int currSum = 0; 
            for (int ends = start; ends < arr.length; ends++){
                currSum += arr[ends];
                if (currSum > max ){
                    max =  currSum;
                }
            };
        }
        System.out.println("Max Subarray: "+max);
    };

        // {1,-4,2,-9,8,1}; 
    public static void PrefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        // calculate prefix sum - formula prefix[i-1] + arr[i] 
        prefix[0] =  arr[0];
        for (int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1]+ arr[i];
        };

        int max = Integer.MIN_VALUE;

        for (int st = 0; st < arr.length; st++){
            int curr = 0;
            for (int end = st; end < arr.length; end++){
                curr = st == 0 ? prefix[end] : prefix[end] - prefix[st-1];
                if (curr > max ){
                    max = curr;
                };
            };
        };
        System.out.print("Max SubArrays: "+max);
    }
    public static void main(String args[]){
        int arr[] = {1,-4,2,-9,8,1};
        // PrintSubArray(arr);
        // MaxSubArray(arr);
        // MaximumSubArray(arr);
        PrefixSum(arr);
    }
}