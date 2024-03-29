public class Main {
    public static void main(String[] args) {
        System.out.println(isOdd(-5));
        System.out.println(isOdd(-1));
        System.out.println(isOdd(14));
        System.out.println(isOdd(13));

        System.out.println(sumOdd(13,13));

    }
        public static boolean isOdd(int number) {
            if(number < 0) {
                return false;
            }
            return number % 2 != 0;
        }

        public static int sumOdd(int start, int end) {

            int sum = 0;
            if( end < 0 || start < 0 || start > end) {
                return -1;
            }
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }




}
