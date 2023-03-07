package oneDarraypkg;

import java.util.Scanner;


public class SearchElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int key;
        System.out.println("Enter the array");
        int indx;
        for(indx =0 ;indx<arr.length;indx++)
        {
            arr[indx]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        key = sc.nextInt();
        for(indx = 0 ;indx<arr.length;indx++)
        {
            if(arr[indx]==key){
                System.out.println("Element found at index "+indx);
            }
        }    
    }
}
