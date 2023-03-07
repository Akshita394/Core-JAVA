package looppkg;
import java.util.Scanner;
public class Lpattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=(num+1)-i;j<=num;j++)
            {
                System.out.print(j);
            }    
            System.out.println();
        }    
    }
}
