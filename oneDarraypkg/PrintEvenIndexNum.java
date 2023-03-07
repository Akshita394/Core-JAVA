package oneDarraypkg;

import java.util.Scanner;


public class PrintEvenIndexNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the array");
        int indx;
        for(indx=0;indx<arr.length;indx++)
        {
            arr[indx] = sc.nextInt();
        }
        System.out.println("Even index numbers are:-");
        for(indx=0;indx<arr.length;indx++)
        {
            if(indx%2==0)
            {
                System.out.println(arr[indx]);
            }    
        }
    }    
}
