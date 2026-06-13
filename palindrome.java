//This is my java program to check the given string is palindrome or not
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the String: ");
     String str = sc.nextLine();
     System.out.println(palindrome(str));
     
    }
     public static boolean palindrome(String str){
        int n = str.length();
     for(int i=0;i<n/2;i++){
        if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;
        }
     }
     return true;
     }





}
