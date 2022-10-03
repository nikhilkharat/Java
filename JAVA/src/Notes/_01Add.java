package Notes;

import java.util.Scanner;

public class _01Add {

    void Add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st No");
        int a= scanner.nextInt();
        System.out.println("Enter 2nd No");
        int b= scanner.nextInt();
        System.out.println(a+b);


    }

    public static void main(String[] args) {

        _01Add add= new _01Add();
        add.Add();
    }
}
