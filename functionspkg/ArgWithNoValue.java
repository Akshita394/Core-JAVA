
package functionspkg;

import java.util.Scanner;


public class ArgWithNoValue {
    public static void main(String args[]){
        ArgWithNoValue obj = new ArgWithNoValue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.add(a, b);
    }
    void add(int num1,int num2)
    {
        int result  = num1+num2;
        System.out.println("The result is "+result);
    }
   
}
