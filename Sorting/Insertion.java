class insertion {
    //{5,4,1,3,2};
    // 4 < 5 swap - {4,5,1,3,2}
    // i = 1, j = 5 => {4,1,5,3,2}
    // i = 1, j = 4
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++ ){
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1]= arr[prev];
                prev--;
            };

            arr[prev+1]= curr;
        };

       
    };

    public static void main(String args []){
        int arr[] = {5,4,1,3,2};
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print( " "+ arr[i]);
        } 
    }
} 