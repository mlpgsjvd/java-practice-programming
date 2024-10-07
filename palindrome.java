package exception;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
