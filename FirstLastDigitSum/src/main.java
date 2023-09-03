public class main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(505));
        System.out.println(sumFirstAndLastDigit(428282));
    }
        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                return -1;
            }
            int firstNum = number;
            int finalNum = firstNum % 10;
            while (firstNum >9) {

                firstNum /= 10;
            }
            int sum = firstNum + finalNum;
            return sum;

        }
    }

