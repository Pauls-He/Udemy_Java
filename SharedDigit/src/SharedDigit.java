public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,9));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(19,99));
        System.out.println(hasSharedDigit(44,14));



    }
    public static boolean hasSharedDigit(int firstNum, int secNum) {
        int x1 = firstNum / 10;
        int x2 = firstNum % 10;
        int y1 = secNum / 10;
        int y2 = secNum % 10;
        if(firstNum < 10 || firstNum > 99 || secNum < 10 || secNum > 99) {
            return false;
        }
        else if((x1 == y1 || x2 == y1 || y2 == x1 || y2 == x2)) {
            return true;
        }else
            return false;
    }
}
