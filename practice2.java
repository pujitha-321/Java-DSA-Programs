//TO CHECK IF A CHARACTER IS CAPITAL OR SAMLL
class character{
public static void main(String[] args){

//Character checkchar letters;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the letter : ");
letters = sc.next().charAt(0);
if(letters <= 'Z' ){
   System.out.println("It is a captital Letter");

}
else{

    System.out.println("It is a small Letter");
}

}
}
