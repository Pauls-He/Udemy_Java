public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
    public static boolean hasSameLastDigit(int first, int second, int third){
        if(first < 10 || second < 10 || third < 10) {
            return false;
        }else if(first > 1000 || second > 1000 || third > 1000) {
            return false;
        }else if(first % 10 == second % 10 || first % 10 == third % 10 || second % 10 == third % 10){
            return true;
        }else if(first / 10 == second / 10 || first / 10 == third / 10 || second / 10 == third / 10){
            return false;
        }else if(first % 10 == second / 10 || first % 10 == third / 10 || second % 10 == third / 10 ||
                second % 10 == first / 10 || third % 10 == first / 10 || third % 10 == second / 10){
            return true;
        }
        else
            return false;
    }
    public static boolean isValid(int forth){
        if(forth < 10 || forth > 1000) {
            return false;
        }else {
            return true;
        }
    }
}
