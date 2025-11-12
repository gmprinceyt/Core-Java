class Selection {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        for (int i = 0; i < arr.length-1; i++){
            int small = Integer.MAX_VALUE;
            int index = 0;
            for (int j= i+1; j < arr.length; j++){
                if (small > arr[j]){
                    small = arr[j];
                }
            };
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp; 
        };

        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i] );
        }
        
    }
}


