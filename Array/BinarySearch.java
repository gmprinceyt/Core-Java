import java.util.*;

class BinarySearch {

    public static int BinarySearchNumber(int arr[], int key){
        int start = 0;
        int end =   arr.length-1;
        while( start <= end){
           int mid = (end + start ) / 2;
            if (arr[mid] == key){
                return mid;
            } else if (arr[mid] > key){
                end = mid - 1; 
            } else {
                start =  mid + 1;
            }
        };
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Array[] = {3,5,6,8,9,13,34,63}; 
        System.out.print("Enter Your Key: ");
        int key = sc.nextInt();

        int res  = BinarySearchNumber(Array, key);
        System.out.print(res);
    }
}