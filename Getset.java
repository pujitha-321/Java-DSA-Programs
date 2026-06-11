//THIS IS PROGRAM USING GET ATTRIBUTES
public class Getset {
    public static void main(String[] args){

     department student1 = new department();
     student1.AIMl(4500);
     System.out.println(student1.get(fees));


    }
}
class department{
    int deptid;
    String deptname;
    int fees;

    public void AIMl(int b){
        this.fees = b;
    }
    public int getfees(){
        return this.fees;

}
