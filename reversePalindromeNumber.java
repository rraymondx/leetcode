import java.util.Arrays;

/**
 * reversePalindromeNumber
 */
public class reversePalindromeNumber {

    public static boolean isPalindrome(int x) {

        // changing int to string
        String numToStr = String.valueOf(x);
        // string to char
        char[] arr = numToStr.toCharArray();
        // gets number of digit
        int digit = 0;
        for(char c : arr) {
            digit++;
        }

        // reversing array
        char[] reverseArr = new char[digit];
        int maxDigit = digit;
        
        for(int i = 0; i < digit; i++) {
            // maximum number of digit - 1 would be the last place
            reverseArr[maxDigit - 1] = arr[i];
            maxDigit -= 1;
        }

        // compare array
        if (Arrays.equals(arr, reverseArr)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        // test
        System.out.println(isPalindrome(101));
    }

}