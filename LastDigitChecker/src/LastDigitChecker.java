public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isValid(9));
        System.out.println(isValid(10));
        System.out.println(isValid(-11));
        System.out.println(isValid(-1));
        System.out.println(hasSameLastDigit(9,99,19));
        System.out.println(hasSameLastDigit(1,1,2));
        System.out.println(hasSameLastDigit(15,9,20));

    }

    public static boolean hasSameLastDigit(int x, int y, int z) {

        if(x < 10 || y < 10 || z < 10 ) {
            return false;
        } else if((x > 1000) || (y > 1000) || (z > 1000 )){
            return false;
        }else if(x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10){
            return true;
        } else if(x / 10 == y / 10 || x / 10 == z / 10 || y / 10 == z / 10) {
            return false;
        } else if(x % 10 == y / 10 || x % 10 == z / 10 || y % 10 == z / 10 || y % 10 == x / 10 || z % 10 == x / 10 || z % 10 == y / 10){
            return true;
        }

        else

            return false;
    }
    public static boolean isValid(int b) {

        if(b < 10 || b > 1000) {
            return false;
        }else {
            return true;
        }
    }
}
