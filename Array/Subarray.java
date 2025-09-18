// [1,2,3,4] => 1 ,2 => 

class Subarray {
    public static void PrintSubArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k]+", ");
                };
                System.out.println();
            };
        };
    };

    //Brute Force Approach 
    public static int MaxSubArraySum(int  arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int sum = 0; 
                for (int k = i; k <= j; k++){
                    sum += arr[k];
                };
                if (sum > max){
                    max = sum; 
                }
            }
        };
        return max;
    };

    // Prefix - Some Batter Way to Do it.  
    public static void MaxSubArray_Sum(int arr[]){
        // {1,-2, 6, -1,3} 
        int prefix_arr[] = new int[arr.length]; // {0,0,0,0,0,} => 1.
        for (int i = 1; i < prefix_arr.length; i++){
            prefix_arr[i] = prefix_arr[i-1] + arr[i];
        };
        
        for (int i = 0; i < arr.length; i++){
                System.out.print(prefix_arr[i]+" ");
            // for (int j = i; j < arr.length; j++){
            // }
        }
    };

    public static void main(String args []){
        // int arr[] = {1,2,3,4,5};
        // PrintSubArray(arr);

        // int arr[] = {1,-2, 6, -1,3};
        // PrintSubArray(arr);
        // int res = MaxSubArraySum(arr);
        // System.out.println(res);
        int arr[] = {1,-2, 6, -1,3};    
        MaxSubArray_Sum(arr);

    };
}