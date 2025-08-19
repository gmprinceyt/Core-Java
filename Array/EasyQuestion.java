class EasyQuestion {

    public static void ReverseArray(int arr[]){
        int start = 0, end = arr.length -1;

        //Two Pointer Approach 
        while (start < end){
            int temp = arr[start];
            // Swap Array Value
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; // Increase Posstion
            end--; // Decrease Posstion
        };
    };

    public static void PairsInArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            int pair = arr[i]; 
            for (int j = i+1; j < arr.length; j++){
                System.out.print(" ( " + pair + ","+ arr[j]+ " ) ");
            };
            System.out.println();
        };
        System.out.println("Total Pairs: "+ (arr.length*(arr.length-1)-1)/2);
    }

    public static void main(String args []){
        int Arr[] =  {1,2,3,4,5,6,7};

        // ReverseArray
        // ReverseArray(Arr);
        // for (int i = 0; i <  Arr.length; i++){
        //     System.out.print( Arr[i]+ " ");
        // }



        PairsInArray(Arr);
    };
}