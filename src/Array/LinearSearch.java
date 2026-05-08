package Array;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array Element");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Element to Found ");
        int target=sc.nextInt();
        boolean found=false;
        for (int i = 0; i < n; i++) {
            if (arr[i]==target)
            {
                found=true;
                System.out.println("Element is Found at Index "+i);
            }
        }

        if (!found)
        {
            System.out.println("Element Not Found ");
        }
    }
}
