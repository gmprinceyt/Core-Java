import java.util.*;

public class Basic {

    public static void output(){

        //Defind 
        int arr[] = new int[50]; // 0,0,0,0...(50 size);
        // output - menual
        System.out.print(arr[0]); //name and index.
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.print(arr[3]);// ^...50;

        // using loop
        System.out.print(arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void input(){
        int number[] = new int[10];
        // input
        Scanner sc = new Scanner(System.in);

        //manual way - input
        // number[0] = sc.nextInt();        
        // number[1] = sc.nextInt();        
        // number[2] = sc.nextInt();        
        // number[3] = sc.nextInt();        
        // number[4] = sc.nextInt();   

        // Using loop - input
        System.out.print("Enter Array Value: ");
        for (int i = 0; i < 10; i++){
            number[i] = sc.nextInt();
        }

        number[9] = 190;

        // Print Array
        for (int i = 0; i < 10; i++){
            System.out.print(number[i]+ " ");
        }     
    }

    public static void MarkParcentage(){
        int Marks[] = new int[4];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Math Marks: ");
        Marks[0] = sc.nextInt();
        System.out.print("Enter Phygics Marks: ");
        Marks[1] = sc.nextInt();
        System.out.print("Enter Chemestory Marks: ");
        Marks[2] = sc.nextInt();
        System.out.print("Enter Biology Marks: ");
        Marks[3] = sc.nextInt();
        
        int parcentage = (Marks[0] + Marks[1] + Marks[2] + Marks[3])/4;
        System.out.print("Marks Parcentage: "+ parcentage +"%" );
        
    }

    public static void PassByRefreanceInArray(int arr[], int some){
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = arr[i] + 1;
        };

        some = 100;
    }


    public static void main (String args []){
        // output()
        // input();
        // MarkParcentage();

        int some = 99;
        int arr[] = {99,89,79}; // 100, 90,80
        PassByRefreanceInArray(arr, some);
        System.out.print(arr[0]+ " ");
        System.out.print(arr[1]+ " ");
        System.out.print(arr[2]+ " ");
        System.out.print(" ->Some:"+ some); // 99 -> no changes
    }
}