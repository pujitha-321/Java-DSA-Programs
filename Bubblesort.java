public class Bubblesort {
    public static void main(String[] args){
       int[] array = {10,5,6,7,8,9};  
       Sort(array);
       for(Integer i :array){
        System.out.print(i +" ");
       }
    }
    static void Sort(int[] array){
    int n = array.length;
for(int turns =0;turns<n;turns++){
    for(int i=0;i<n-1-turns;i++){
        int curr = array[i];
        int next = array[i+1];
        if(curr > next){
        Swap(i,array);
        }
    }
}
    }
    static void Swap(int i,int[] array){
        int temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
    }

}
    
    

