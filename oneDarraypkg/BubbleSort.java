package oneDarraypkg;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the array");
        int indx;
        int indx1;
        for(indx =0;indx<arr.length;indx++)
        {
            arr[indx]=sc.nextInt();
        }
        /*for(indx =0 ;indx < arr.length-1;indx++){
            for(indx1 = 0;indx1<arr.length-1;indx1++)
            {
                if(arr[indx1]>arr[indx1+1]){
                    int temp = arr[indx1];
                    arr[indx1] = arr[indx1+1];
                    arr[indx1+1] = temp;
                }
            }    
        }
        System.out.println("Sorted Array in ascending order");
        for(indx =0;indx<arr.length;indx++)
        {
            System.out.println(arr[indx]);
        }*/
        for(indx =0 ;indx < arr.length-1;indx++){
            for(indx1 = 0;indx1<arr.length-1;indx1++)
            {
                if(arr[indx1]<arr[indx1+1]){
                    int temp = arr[indx1];
                    arr[indx1] = arr[indx1+1];
                    arr[indx1+1] = temp;
                }
            }    
        }
        System.out.println("Sorted Array in descending order");
        for(indx =0;indx<arr.length;indx++)
        {
            System.out.println(arr[indx]);
        }
    }    
}
