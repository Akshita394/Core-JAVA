
package functionspkg;

import java.util.Scanner;

public class ArgsWithReturnVal {
    double add(double num1,double num2)
    {
        double result = num1+num2;
        return result;
    }        
    public static void main(String args[]){
        ArgsWithReturnVal obj = new ArgsWithReturnVal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double res = obj.add(a, b);
        System.out.println("The resultant is "+res);
    }
}
