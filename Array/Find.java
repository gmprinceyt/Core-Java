import java.util.*;

class Find {
    public static int linearSearch(int arr[], int key){
        for (int i = 0; i <= arr.length; i++){
            if (arr[i] == key){
                return i;
            };
        };
        return -1;
    }
    public static void main(String [] args){

        int arr[] = {3,5,1,6,7,3,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key: ");

        int key = sc.nextInt();
        int res = linearSearch(arr, key);

        if (res == -1){
           System.out.println("Not Fount!");
        }else {
           System.out.println("key is At index: "+ res);
        }
    }
}