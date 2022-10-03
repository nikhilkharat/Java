package Assg;
import java.util.*;
public class _09Array {
    public static String reversString(String input){
//write the logic
        String sum="";
        for(int i=input.length()-1;i>=0;i--){
            sum+=input.charAt(i);
        }return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
//        _09Array obj=new _09Array();

        System.out.println("Reversed String is :"+ result);
    }

}
