class Buy_Sell {
 
    public static int  BuyAndSell(int arr[]){
        int minBuyingPrice = arr[0]; 
        int profit = 0; 

        // { 7,1,5,3,6,4 }
        for (int i = 1; i < arr.length; i++){ 
            int todayProfit = arr[i] - minBuyingPrice; 
            if (profit < todayProfit){
                profit = todayProfit;
            }
            if (minBuyingPrice > arr[i]) minBuyingPrice= arr[i];
        };

        return profit;
    }

    public static void main(String args []){
        int arr[] = {80,3, 2,1,3,4,40};
        int profit = BuyAndSell(arr);
        System.out.print(profit);
    }
}