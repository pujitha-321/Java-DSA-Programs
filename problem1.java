// To identify the frequency of a number in given map
import java.util.*;
public class problem1 {
    public static void main(String[] args){
        int[] arr = {10,11,12,12,12,10,11,13,13};
        Map<Integer,Integer> mp= new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            int ce = arr[i];
            if(!mp.containsKey(ce)){
                mp.put(ce,1);
            }
            else{
                int freq = mp.get(ce);
                mp.put(ce,freq+1);


            }
        }
        System.out.println(mp);
        
    }
    
}
