import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {

        int rem=0;
        int rev=0;
        System.out.println("Enter a number to find the palindrome");
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();
        int c=num;
        for (int i=0; i<=num; i++){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if (c==rev)
            System.out.println("Given number is palindrome");
        else
            System.out.println("Given number is not palindrome");

    }
}
