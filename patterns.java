// TO PRINT PATTERNS
public class patterns{
    public static void main(String[] args){
    int n = 5;
   // To ****
         ****
         ****
        for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.print("*");

      }
      System.out.println();
    }
  
// TO  PRINT *
             * *
             * * *
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
   System.out.println();


  }

//TO PRINT ANOTHER PATTERNN
  int i;
  for( i=1;i<=n;i++){
     for(int j=1;j<=(n-i+1);j++){
     System.out.print("*");
     }
    System.out.println();


  }
// ANOTHER PATTERN
for(int i=1;i<=n;i++){
    int spaces=i-1;
    for(int k=1;k<=spaces;k++){
      System.out.print(" ");
    }
    int stars = n-i+1;
    for(int j=1;j<=stars;j++){
     System.out.print("*");

    }
    System.out.println();
}
    //NUMERICAL PATTERN
    for(int i=1;i<=5;i++){
      
       for(int j=1;j<=i;j++){
        System.out.print(j+" ");
        }

        System.out.println();

      }











    }
  
    }


      


    
