
package functionspkg;

import java.util.Scanner;

public class NoArgsWithValue {
    Scanner sc = new Scanner(System.in);
    double add(){
        int num1;
        double num2;
        System.out.println("Enter two numbers to add");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        double result  = num1+num2;
        return result;
    }
    public static void main(String args[]){
        NoArgsWithValue obj = new NoArgsWithValue();
        double res = obj.add();
        System.out.println("The result is "+res);
    }
}
