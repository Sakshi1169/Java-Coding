package Numbers;
import java.util.*;
//Number is Palindrome or not
// Palindrome Number-->Number Remains Same After Reversing original Number
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int rev=0;
        while (num>0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }

        if (original==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
