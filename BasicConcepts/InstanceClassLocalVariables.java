package BasicConcepts;

import java.util.Scanner;

public class InstanceClassLocalVariables {
    int a;//instance variable
    static int b;//class variable
    
    public static void main(String [] args ){
    Scanner sc = new Scanner(System.in);
    InstanceClassLocalVariables obj = new InstanceClassLocalVariables();
    obj.a = sc.nextInt();
    //obj.b = new.nextInt();
    //b = new.nextInt();
    InstanceClassLocalVariables.b = sc.nextInt();
    System.out.println(obj.a);
    System.out.println(InstanceClassLocalVariables.b);
    }
}
