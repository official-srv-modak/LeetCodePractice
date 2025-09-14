public class PalindromeNumberString {
    public static boolean isPalindrome(int x) {
        int number = x;
        int reversed = 0;
        if(number < 0)
            return false;

        while (x!= 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }
        if(number == reversed)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
