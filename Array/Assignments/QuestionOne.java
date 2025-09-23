class QuestionOne {
    public static Boolean Question(int[]arr){
        for (int t = 0; t < arr.length; t++){
            for (int i = t+1; i < arr.length; i++){
                if (arr[t]== arr[i]){
                    return true;
                }
            }
        };
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,9};
        Boolean res = Question(arr);
        System.out.print(res);
    }
}