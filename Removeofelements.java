package String;

import java.util.Scanner;

public class Removeofelements {

    // Method to remove all non-alphabet characters
    public static String removeChars(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Keep only alphabets (A-Z and a-z)
            if (Character.isLetter(ch)) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = removeChars(s);

        System.out.println("String after removing non-alphabet characters: " + result);

        sc.close();
    }
}