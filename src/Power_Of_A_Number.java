import java.util.Scanner;

public class Power_Of_A_Number {
    public static void main(String[] args) {

        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number(Base)");
        int base = sc.nextInt();
        System.out.println("Enter a Number(Power)");
        int power = sc.nextInt();

        result = base;

        for (int i = 1; i < power; i++) {
            result = base * result;

        }
        System.out.println(result);
    }
}
