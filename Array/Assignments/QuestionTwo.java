class  QuestionTwo {
    public static int Answer(int prices[]){
        int maxProfit = 0;
        int buyPrice  = prices[0]; // initial buying price;
        for (int i = 1; i < prices.length; i++){
            int todayProfit =  prices[i] - buyPrice;

            if (buyPrice > prices[i]){
                buyPrice = prices[i];
            };
            if (maxProfit < todayProfit){
                maxProfit = todayProfit;
            };
        };
        return maxProfit;
    }
    public static void main(String args[]){
        int arr[] = {9,8, 7,6, 5, 4};
        int res = Answer(arr);
        System.out.print(res);
    }
}