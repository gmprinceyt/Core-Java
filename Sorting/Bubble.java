class Bubble {
    public static void BubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if  (arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                };
            };
        };
    }
    public static void main(String  args [] ){
        int arr[] = {5,4,1,3,2};
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        } 
    }
}