package Day1;
import java.util.Scanner;


class SI {
    public static void main(String[] args) {
        System.out.println("Enter Principal");
        Scanner principal = new Scanner(System.in);
        float Principal = principal.nextFloat();

        System.out.println("Enter Interest");
        Scanner interest = new Scanner(System.in);
        float Interest = interest.nextFloat();

        System.out.println("Enter Tenure");
        Scanner tenure = new Scanner(System.in);
        float Tenure = tenure.nextFloat();

        float Simple_Interest = (Principal*Interest*Tenure)/100;
        System.out.println("Simple Interest is:" + Simple_Interest);
    }
}