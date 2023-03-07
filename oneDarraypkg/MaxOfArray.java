package oneDarraypkg;

import java.util.Scanner;

public class MaxOfArray {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter an array");
     int arr[] = new int[10];
     int indx;
     for(indx = 0;indx<arr.length;indx++)
     {
         arr[indx]=sc.nextInt();
     }
     int max = arr[0];
     for(indx = 0;indx<arr.length;indx++)
     {
         if(arr[indx]>max)
         {
             max = arr[indx];
         }    
     }
     System.out.println("Max Element of array = "+max);
 }     
}
