
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Enter a number to determine if it is even or odd");
        num = scan.nextInt();

        if(num%2==0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}