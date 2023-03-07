package twoDarraypkg;

import java.util.Scanner;

public class addTwoArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int res[][] = new int[3][3];
        System.out.println("Enter first 2-D array of 3*3");
        int indx;
        int indx1;
        for(indx=0;indx<arr1.length;indx++)
        {
            for(indx1=0;indx1<arr2.length;indx1++)
            {
                arr1[indx][indx1] = sc.nextInt();
            }    
        }
        System.out.println("Enter scond 2-D array of 3*3");
        for(indx=0;indx<arr2.length;indx++)
        {
            for(indx1=0;indx1<arr2.length;indx1++)
            {
                arr2[indx][indx1] = sc.nextInt();
            }    
        }
        System.out.println("Entered arrays are");
        for(indx=0;indx<arr1.length;indx++)
        {
            for(indx1=0;indx1<arr2.length;indx1++)
            {
                System.out.print(arr1[indx][indx1]+" ");
            } 
            System.out.println("");
        }
        System.out.println("");
        for(indx=0;indx<arr1.length;indx++)
        {
            for(indx1=0;indx1<arr2.length;indx1++)
            {
                System.out.print(arr2[indx][indx1]+" ");
            } 
            System.out.println("");
        }
        
        System.out.println("");
        for(indx=0;indx<arr1.length;indx++)
        {
            for(indx1=0;indx1<arr2.length;indx1++)
            {
                res[indx][indx1]= arr1[indx][indx1]+arr2[indx][indx1];
            } 
        }
        System.out.println("Resultant array is ");
        for(indx=0;indx<arr1.length;indx++)
        {
            for(indx1=0;indx1<arr2.length;indx1++)
            {
                System.out.print(res[indx][indx1]+" ");
            } 
            System.out.println("");
        }
    }   
    
}
