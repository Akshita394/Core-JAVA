package functionspkg;

import java.util.Scanner;

public class NoArgNoVal {
    Scanner sc = new Scanner(System.in);
    void add()
    {
        int num1;
        int num2;
        System.out.println("Enter two numbers to add");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int result  = num1+num2;
        System.out.println("The result is "+result);
    } 
    public static void main(String args[]){
        NoArgNoVal obj = new NoArgNoVal();
        obj.add();
    }
}
