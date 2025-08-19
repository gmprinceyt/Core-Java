class EasyQuestion {
    public static void ReverseArray(int arr[]){
        int start = 0, end = arr.length -1;

        //Two Pointer Approach 
        while (start < end){
            int temp = arr[start];
            // Swap Array Value
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++;
            end--;
        };
    };

    public static void main(String args []){
        int Arr[] =  {1,2,3,4,5,6,7};
        ReverseArray(Arr);

        for (int i = 0; i <  Arr.length; i++){
            System.out.print( Arr[i]+ " ");
        }
    };
}