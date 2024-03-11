import java.sql.SQLOutput;
import java.util.Scanner;


public class NoOfDigitsInNum {
    public static void main(String[] args) {
        int n, count= 0;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("The number of digits are "+ count
        );

    }
}
