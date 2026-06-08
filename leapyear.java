class leapyear{
public static void main(String[] args){
   
//Leap year checking
int number;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
number = sc.nextInt();
if(number%4 == 0 && number%100!=0){
    System.out.println("It is a leap Year");

}
else{
    System.out.println("It is not a leap year");
}
}
}









   
















