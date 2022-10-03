package Assg;

import java.util.*;

public class _09Array1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size");
        int n=sc.nextInt();
        System.out.println("Enter Column Size");
        int m=sc.nextInt();
        int[][]arr=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i< m;i++){
            int ans=0;
            for (int j=0;j<n;j++){
                if (arr[j][i]%2==0){
                    ans+=arr[j][i];
                }

            }System.out.println(ans+" ");
        }

    }
}
