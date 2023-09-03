public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(755));
        System.out.println(isPalindrome(55));
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (num != 0) {
            int lastDigit = num % 10;
            num /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }
        if (reverse == number)
            return true;
        return false;
    }
}
