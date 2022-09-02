import java.util.Scanner;

public class Armstrong_num {

    public static void main(String[] args) {

        int n,Arm=0,rem,c;
        System.out.println("Enter a Num to Check Armstrong Num");

        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while (n>0){
            rem=n%10;
            Arm=(rem*rem*rem)+Arm;
            n=n/10;
        }
        if (c==Arm)
            System.out.println(Arm + " is Armstrong Number");
        else
            System.out.println(Arm + " is Not Armstrong Number");
    }
}
