import java.util.Scanner;

/**
 * Created by alexm on 19.07.2018.
 */
public class Palindrom {
    public static boolean isPalindrome(Integer number) {

        String original = number.toString();
        int i = original.length() - 1;
        int j = 0;

        while (i > j) {
            if (original.charAt(i) != original.charAt(j)) {
                return false;
            }

            i--;
            j++;
        }

        return true;
    }

    public static void minNumByPalindrom(Integer integer) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        do {
            for (int i = number; isPalindrome(integer); i++) ;
        }
        while (!isPalindrome(integer));
    }


    public static void main(String[] args) {
      Palindrom.minNumByPalindrom(256);
    }
}
