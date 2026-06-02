// THESE ARE THE 3 SIMPLE JAVA PROGRAMS 
class simpleprograms{
public static void main(String[] args){
  
//Cheching the number posive or negative
int number;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = sc.nextInt();
if(number<0){
    System.out.println("It is a negative number");

}
else if(number == 0){
    System.out.println("It is Zero");
}
else{
    System.out.println("It is a positive number");
}


