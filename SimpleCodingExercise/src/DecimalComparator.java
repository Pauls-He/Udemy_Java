public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(0,0));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,-3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,
                                                       double secondNumber){
        if((int) (firstNumber * 1000) == (int) (secondNumber * 1000)){
            return true;
        } else {
            return false;
        }
    }
}
