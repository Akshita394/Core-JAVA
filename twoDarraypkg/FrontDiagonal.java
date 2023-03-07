package twoDarraypkg;

import java.util.Scanner;

public class FrontDiagonal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the 2-D array of 3*3");
        int indx,indx1;
        for(indx=0;indx<arr.length;indx++)
        {
            for(indx1=0;indx1<arr.length;indx1++)
            {
                arr[indx][indx1]=sc.nextInt();
            }    
        }
        System.out.println("");
         for(indx=0;indx<arr.length;indx++)
        {
            for(indx1=0;indx1<arr.length;indx1++)
            {
                System.out.print(arr[indx][indx1]+" ");
            }    
            System.out.println("");
        }
        System.out.println("Front Diagonal elements ");
        for(indx=0;indx<arr.length;indx++)
        {
            for(indx1=0;indx1<arr.length;indx1++)
            {
                if(indx==indx1)
                {
                    System.out.println(arr[indx][indx1]);
                }    
            }    
        }
    }        
}
