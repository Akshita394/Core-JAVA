package looppkg;

import java.util.Scanner;

public class Lpattern9 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int n=1;
        for(int i=1;i<num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n+" ");
                n= n+2;
            } 
            System.out.println();
        }    
    }
}
