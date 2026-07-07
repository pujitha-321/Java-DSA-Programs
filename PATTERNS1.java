public class PATTERNS1{
   public static void main(String[] args){
   //to print first pattern

   int n = 4;
   for(int i=1;i<=n;i++){
    int spaces=n-i;
    for(int k=1;k<=spaces;k++){
         System.out.print(" ");
   }
   //to print stars
     for(int j=1;j<=(2*i)-1;j++){

        System.out.print("*");
     }
     System.out.println();
   }
}
}