public class Selectionsort {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        int n = arr.length;
       
        // Selection Sort
        for(int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for(int j = i + 1; j < n; j++) {

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

       
    }
}