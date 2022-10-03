package Notes;

public class _09Array3 {

    public static void main(String[] args) {
        int[] marks={8,9,5,3,10};
        int sum=0;
        for(int el:marks){
            sum+=el;
        }
        System.out.println("Total Marks :-"+sum);
        System.out.println("Avg Marks :-"+sum/marks.length);
    }
}
