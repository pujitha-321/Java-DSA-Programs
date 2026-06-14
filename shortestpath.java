//TO FIND THE STORTEST PATH OR DISTANCE 
public class shortestpath {
    public static void main(String[] args){
     String str = "WESNNEEWW";
     int x = 0;
     int y = 0;
     for(int i=0;i<str.length();i++){
      char current = str.charAt(i);
    if(current == 'W'){
        x--;
      }
     else if(current == 'E'){
       x++;
     }
     else if(current == 'N'){
        y++;
     }
     else if(current == 'S'){
        y--;
     }
     }
     double distance = Math.sqrt(y*y - x*x);
     System.out.println("The shortest distance is: "+distance);
     }


    }
    

