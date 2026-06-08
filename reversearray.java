public class reversearray {
    
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Reverse array
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        // Print reversed array
        System.out.println("Reversed array is:");
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

