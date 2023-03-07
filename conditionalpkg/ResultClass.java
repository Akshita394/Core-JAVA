
package conditionalpkg;

import java.util.Scanner;

public class ResultClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int perc;
        System.out.println("Enter your Percentage");
        perc = sc.nextInt();
        if(perc>=33){
            System.out.println("You are pass");
        }else{
            System.out.println("You are Fail");
        }   
    }
}
