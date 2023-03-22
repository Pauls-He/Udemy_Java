public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        int x1 = firstNumber / 10;
        int x2 = firstNumber % 10;
        int y1 = secondNumber / 10;
        int y2 = secondNumber % 10;
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
            return false;
        }else if(x1 == y1 || x1 == y2 || x2 == y1 || x2 == y2) {
            return  true;
        }else {
            return false;
        }
    }
}
