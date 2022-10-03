package Notes;

public class _09Array2 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30};

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
