import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.print("Factors are ");
        for (int i = 1; i <=a ; i++) {
            if (a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
