package Notes;

public class _09Array1 {

    public static void main(String[] args) {
        int [] array=new int[3];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        //array[3]=40; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        System.out.println(array);//print address
        System.out.println(array.length);//3
        //using for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); //10,20,30
        }
        //using foreach
        for(int el:array){
            System.out.println(el);
        }
    }
}
