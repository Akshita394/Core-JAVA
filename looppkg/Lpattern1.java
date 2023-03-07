
package looppkg;

import java.util.Scanner;

public class Lpattern1 {
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<num;j++)
            {
                System.out.print("*");
            }    
            System.out.println();
        }    
    }
}
