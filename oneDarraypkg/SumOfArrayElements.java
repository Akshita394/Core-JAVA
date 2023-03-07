package oneDarraypkg;

import java.util.Scanner;


public class SumOfArrayElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the array Elements");
        int indx;    
        for(indx=0;indx<arr.length;indx++)
        {
            arr[indx] = sc.nextInt();
        }    
        
        int sum =0;
        for(indx=0;indx<arr.length;indx++)
        {
            sum+= arr[indx];
        }
        System.out.println("Sum of all elements of array = "+sum);
    }
}
