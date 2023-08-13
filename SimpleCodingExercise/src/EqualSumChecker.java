public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(11,22,33));
        System.out.println(hasEqualSum(100,1,99));
    }
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber + secondNumber == thirdNumber){
            return true;
        } else {
            return false;
        }
    }
}
