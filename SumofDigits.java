class SumofDigits{ 
    public static void main(String[] args){
      int num = 123;
      int sum = 0;
      int lastdigit = num%10;
      sum = sum+lastdigit;

      num = num/10;
      lastdigit = num%10;
      sum += lastdigit;
      num = num/10;
      



    }
}