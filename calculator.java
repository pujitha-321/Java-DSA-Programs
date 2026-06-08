// PROGRAM FOR GRADE CALCULATOR
class gradecalculator{
public static void main(String[] args){
    //Grade CAlculator
     int marks;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the marks: ");
marks = sc.nextInt(); 
if(marks>=95){
    System.out.println("A Grade");
}
else if(marks>=75){
    System.out.println("B Grade");

}
else if(marks>=50){
    System.out.println("C Grade");
}
else{
    System.out.println("Fail");
}
}
}



