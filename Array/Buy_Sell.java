class Buy_Sell {
 

    // Selft Logic Code 
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
    };

    //  Other Code 
    public static int BuyAndSell2(int [] prices){
        int maxProfit = 0;
        int minBuyingPrice = prices[0];

        for (int p = 0; p < prices.length; p++ ){
            if (minBuyingPrice < prices[p]){
                int todayProfit = prices[p]-minBuyingPrice;
                maxProfit = Math.max(todayProfit, maxProfit);
            } else {
                minBuyingPrice = prices[p];
            }
        }
        return maxProfit; 
         
    }


    public static void main(String args []){
        int arr[] = {80,3, 2,1,3,4,40};
        int profit = BuyAndSell2(arr);
        System.out.print(profit);
    }
}