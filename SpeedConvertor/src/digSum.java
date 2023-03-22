public class digSum {
    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is " + sumDigits((125)));
        System.out.println("Sum of digits in number -125 is " + sumDigits((-125)));
        System.out.println("Sum of digits in number 4 is " + sumDigits((4)));
        System.out.println("Sum of digits in number 32123 is " + sumDigits((32123)));
    }
    public static int sumDigits(int number){
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0){
            //extract the last-significant digit
            int digit = number % 10;
            sum += digit;
            //drop the last-significent digit
            number/= 10; // same as number = number / 10
        }
        return sum;
    }
}
