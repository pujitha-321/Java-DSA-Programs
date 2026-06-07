// BASIC ARRAY PROGRAM
public class Arrays {
    public static void main(String[] args){
       
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(array[6]);
    }
}

//CHANGE THE ARRAY VALUE
class Arrays{
    public static void main(String[] args){
        int[] array = {4,5,6,3,2,1};
        array[4] = 6;
        System.out.println(array[4]);
    }
}
//LOOP IN ARRAY
class Arrays{
    public static void main(String[] args){
    int[] arr = {1,5,5,3,7,8};
    arr[4] = 9;
    for(Integer i:arr){
System.out.println(i);

    }
    }
}
//cHANGING ARRAY VALUE & DO LOOP
class Arrays{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,6,7,8};
        arr[3] = 10;
        for(int i=0;i<=8;i++){
            System.out.println(arr[i]);
        }

    }
}

// TAKING INPUT AND PRINT OUTPUT THE ARRAY
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the arrayy :  ");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("ENter array elements: ");
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }

System.out.println("Array Elements are : ");
for(int i=0;i<size;i++){
    System.out.println(arr[i]);
}
}
}
//FUNCTIONS IN ARRAYS
class Arrays{
    
        static void printArray(int[] arr){
            for(int i=0;i<arr.length;i++){
                arr[3] = 80;
            System.out.println(arr[i]);
            }

        }



        public static void main(String[] args){
            int[] arr= {10,20,30,40,50};

            printArray(arr);
        }
    }
