package Notes;

import java.util.*;

public class _09Array6 {

    public void givenString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enete String");
        String s= sc.next();
        System.out.println("Enete Target");
        int k= sc.nextInt();
        String target="";
//        for (int i=0;i<k;i++){
//            target=target+s[i];
//        }
        System.out.println(target);
    }

    public static void main(String[] args) {
        _09Array6 obj=new _09Array6();
        obj.givenString();
    }
}
