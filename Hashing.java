import java.util.*;
public class Hashing {
    public static void main(String[] args){
        Map<Integer,String>mp = new HashMap<>();
        System.out.println(mp);
        //Using Put METHOD

        mp.put(1,"Krishna");
        mp.put(2,"Radha");

        //Using GET method

        System.out.println(mp);
        System.out.println(mp.get(2));

        //USING CONTAINSVALUE() METHOD
        System.out.println(mp.containsValue("Radha"));
        
        //CHECK THE SIZE OF THE MAP using size()method
        System.out.println(mp.size());

        
    }
}
