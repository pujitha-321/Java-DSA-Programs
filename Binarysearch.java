public class Binarysearch{
    public static void main(String[] args){

       int[] arr = {10,20,30,40,50,60};
       int k = 50;
       int ind = search(arr,k);
       System.out.println(ind);




    }
    static int search(int[] arr,int k){

        int mid,low = 0,high = arr.length;
         while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] == k){
                return mid;

            }
            else if(arr[mid]<k){
                low = mid+1;
                
            }
            else if(arr[mid] > k){
                high = mid-1;
               
            }
            
         }
        return -1;



    }


    }
