//THIS IS MY BASIC JAVA PROGRAM USING OOPS CONCEPTS
//TO PRINT STRING NAME
class Oops{
    public static void main(String[] args){
     ECE student1 = new ECE();
     student1.setname("Pujitha");
     System.out.println(student1.name);


    }
}
class ECE{
    int rollno;
    String name;
    int mobile;
    public void setname(String n){
        this.name = n;
    }
}
