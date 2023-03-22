public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum nr. " + sumFirstAndLastDigit(252));
        System.out.println("Sum nr. " + sumFirstAndLastDigit(257));
        System.out.println("Sum nr. " + sumFirstAndLastDigit(0));
        System.out.println("Sum nr. " + sumFirstAndLastDigit(5));
        System.out.println("Sum nr. " + sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) {
            return -1;
        }
        int firstNumber = number;
        int finalNumber = firstNumber % 10;
        while (firstNumber > 9){
            firstNumber /= 10;
        }
        int sum = firstNumber + finalNumber;
        return sum;
    }
}
