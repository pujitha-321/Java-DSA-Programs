//HASHSET PROGRAM
import java.util.*;
public class problem2 {
    public static void main(String[] args){
        // Intersection of two arrays
        int[] arr1 = {10,15,20,30,40};
        int[] arr2 = {10,11,15,25};
        Set<Integer> st = new HashSet<>();
        
            for(int i=0;i<arr1.length;i++){
                st.add(arr1[i]);
            }
            for(int i=0;i<arr2.length;i++){
                int ce = arr2[i];
                if(st.contains(ce)){
                 System.out.print(ce+" ");
                }

            }  
        }
    }

