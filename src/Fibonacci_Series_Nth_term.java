import java.util.Scanner;

public class Fibonacci_Series_Nth_term {
    public static void main(String[] args) {

        int n,a=0,b=1,c;
        System.out.println("Enter a term to get fibonacci series");

        Scanner r = new Scanner(System.in);
        n=r.nextInt();

        for (int i=1; i<=n; i++){

            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
