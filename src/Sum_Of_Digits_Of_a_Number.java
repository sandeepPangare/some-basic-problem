import java.util.Scanner;

public class Sum_Of_Digits_Of_a_Number {
    public static void main(String[] args) {

        int n,r,sum=0;
        System.out.println("Enter any Number ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        while(n>0) {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of Digit "+sum);
    }
}
