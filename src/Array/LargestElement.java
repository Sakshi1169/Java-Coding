package Array;

import java.util.Scanner;
//Find Largest Element in Array

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }

        }
        System.out.println("Largest Elementin Array is : "+largest);
    }
}
