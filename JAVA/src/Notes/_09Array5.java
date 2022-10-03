package Notes;
import java.util.*;
public class _09Array5 {
    public void dob(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size= sc.nextInt();
        System.out.println("Enter Array Elements");
        int []arr= new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        String dob="";
        for(int j=0;j<arr.length;j++){
            dob=dob+(arr[j]*2)+" ";
        }
        System.out.println(dob);
    }
    public static void main(String[] args) {
        _09Array5 obj=new _09Array5();
        obj.dob();
    }
}
