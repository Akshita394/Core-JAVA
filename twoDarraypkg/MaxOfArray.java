package twoDarraypkg;

import java.util.Scanner;


public class MaxOfArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("Enter a 2-D array of 3*3");
        int indx;
        int indx1;
        int max;
        for(indx=0;indx<a.length;indx++)
        {
            for(indx1=0;indx1<a.length;indx1++)
            {
                a[indx][indx1] = sc.nextInt();
            }    
        }
        max = a[0][0];
        for(indx=0;indx<a.length;indx++)
        {
            for(indx1=0;indx1<a.length;indx1++)
            {
               if(a[indx][indx1]>max)
               {
                   max = a[indx][indx1];
               }    
            }    
        }
        System.out.println("Max element is "+max);
    }    
}
