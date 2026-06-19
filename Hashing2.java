//THESE ARE THE HASHING  METHODS
import java.util.*;
class Hashing2{
    public static void main(String[] args){
        
  Map<Integer,String>mp = new HashMap<>();
  
  //USING CONTAINS KEY() METHOD

        System.out.println(mp);
        mp.put(1,"Krishna");
        mp.putIfAbsent(1,"Radha");
        mp.put(2,"Bala");
        System.out.println(mp);

        //USING REMOVE() METHOD
        
        mp.put(1,"Krishna");
        mp.put(2,"Radha");
        mp.put(3,"Bala");
    

        System.out.println(mp);
        mp.remove(2);
        System.out.println(mp);

       
    }
}
