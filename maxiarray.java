// TO FIND MAXIMUM ELEMENT IN ARRAY
public class maxiarray {
    public static void main(String[] args){
      int[] arr = {10,20,30,7,90,50};
      int maxi =0;
      for(int i=0;i<arr.length;i++){
           int curr = arr[i];
           if(curr > maxi){
              maxi = curr;
           }
      }
        System.out.println(maxi);
    }
    
}
