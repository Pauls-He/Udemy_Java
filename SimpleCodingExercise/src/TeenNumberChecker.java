public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(isTeen(7));
        System.out.println(isTeen(13));
        System.out.println(isTeen(19));
        System.out.println(hasTeen(7,2,15));
        System.out.println(hasTeen(15,18,15));
        System.out.println(hasTeen(37,12,15));
    }
    public static boolean hasTeen(int first, int second, int third){
        if(first >= 13 && first <= 19 || second >= 13 && second <= 19 || third >= 13 && third <= 19){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int forth){
        if(forth >= 13 && forth <= 19){
            return true;
        }else {
            return false;
        }
    }
}
