class largeststring{
    public static void main(String[] args){
        String[] names = {"Pujithaa","Vanitha","Rani"};

       String my = "";
       int len = 0;
       for(int i=0;i<names.length;i++){
          if(names[i].length()>len){

           my = names[i];
           len = names[i].length();

        }
       



    }
    System.out.println("The largest string is: "+ my);
}
}