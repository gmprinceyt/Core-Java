import java.util.*;

class BasicQuestion {
    // for number
    public static int linearSearch(int  arr[], int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            };
        };
        return -1;
    };

    public static int linearSearch(String arr[], String key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(key)){
                return i;
            };
        };
        return -1;
    };

    public static int largestElement(int arr[]){
        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE; 

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest ){
                largest = arr[i];
            }
        };
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallest ){
                smallest = arr[i];
            }
        };
        System.out.print("smallest Value: " + smallest + " lergrest: ");
        return largest;
    };

    public static void main(String [] args){

        int arr[] = {3,5,1,6,-9,38,7};
        Scanner sc = new Scanner(System.in);

        int res  = largestElement(arr);
        System.out.print(res);


        // System.out.print("Enter Element: ");
        // int key = sc.nextInt();
        // int res = linearSearch(arr, key);
        // if (res == -1){
        //    System.out.println("Not Fount!");
        // }else {
        //    System.out.println("key is At index: "+ res);
        // };

        // String Searching 
        // String menu[] = {"Samosa", "Dosa", "Friute", "Coke"};
        // String findMenu = sc.next();
        // int res1 = linearSearch(menu, findMenu);
        // System.out.print(res1);

    }
}