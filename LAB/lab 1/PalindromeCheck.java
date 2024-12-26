// Check if the given number is Palindrome number or not

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        int number, rem, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a multidigit number ");
        number = sc.nextInt();

        temp = number;
        while (temp > 0) {
            rem = temp % 10;
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }

        if (number == sum)
            System.out.println("The number " + number + " is Palindrome");
        else
            System.out.println("The number " + number + " is not Palindrome");

        sc.close();
    }
}