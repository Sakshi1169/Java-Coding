package Binary_Search;

//import static java.util.Arrays.binarySearch;

public class BinarySearchDemo {
    public static int binarySearch(int arr[],int target)
    {
        int left=arr[0];
        int right=arr.length-1;

        while (left<=right)
        {
           int mid=left+(right-left)/2;
           if (arr[mid]==target)
           {
               return mid;
           }
           else if(arr[mid]<target)
           {
               left=mid+1;
           }
           else
           {
               right=mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int target = 23;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
