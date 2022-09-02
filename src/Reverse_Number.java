import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {

        int n, rem, rev = 0;
        System.out.println("Enter a number");

        Scanner r = new Scanner(System.in);
        n=r.nextInt();

        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse number is " + rev);
    }
}
