//THIS IS A SECOND PROGRAM USING BASIC OOPS  CONCEPT
public class Oops2 {
    public static void main(String[] args){
      CSE student1 = new CSE();
      student1.another (30);
      System.out.println(student1.add);
    }
}
class CSE{
    int no;
    String name;
    int add;
    public void another( int m){
        this.add = m;
    }
}
