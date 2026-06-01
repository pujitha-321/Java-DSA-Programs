public class occurences {
    public static void main(String[] args){
   // to find number of occurences in a number
   int num = 1756477;
   int count = 0;
   while(num>0){
    int rem = num %10;
    if(rem == 7){
        count ++;

    }
    num = num/10;
   }
System.out.println(count);
    }
}
