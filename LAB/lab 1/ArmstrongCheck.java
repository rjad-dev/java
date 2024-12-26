// Check if the given number is ArmStrong number or not

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongCheck {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, sum = 0, last = 0;
        temp = n;

        while (temp>0) {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while (temp>0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp/10;
        }

        if (n==sum) return true;
        else return false;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a multidigit number ");
        number = sc.nextInt();

        if (isArmstrong(number))
            System.out.println("The number " + number+ " is Armstrong");
        else
            System.out.println("The number " + number+ " is not Armstrong");

        sc.close();
    }
}