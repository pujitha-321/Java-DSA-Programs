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


//Leap year checking
int number;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
number = sc.nextInt();
if(number%4 == 0){
    System.out.println("It is a leap Year");

}
else{
    System.out.println("It is not a leap year");
}

//Swapping Two numbers using temp variable
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number A: ");
int a = sc.nextInt();
System.out.print("Enter the second number B: ");
int b = sc.nextInt();
int temp;
temp = a;
a = b;
b = temp;
System.out.println("A : "+a);
System.out.println("B : "+b);
}
}



