public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(81,153));


    }
    public  static int getGreatestCommonDivisor(
            int first, int second) {
        int largerNum = 0;
        if(first < 10 || second < 10) {
            return -1;
        } else {
            for(int n=1; n<=first; n++) {
                if(first % n == 0 && second % n == 0) {
                    largerNum = n;
                }
            }
        }
        return largerNum;

    }
}
