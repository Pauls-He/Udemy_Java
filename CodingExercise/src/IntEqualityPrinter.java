public class IntEqualityPrinter {
    public static void main(String[] args) {
        System.out.println(printEqual(1,1,1));
        System.out.println(printEqual(1, 1, 2));
        System.out.println(printEqual(-1, -1, -1));
        System.out.println(printEqual(1, 2, 3));

    }
    public static String printEqual(int first,int second, int third){
        if(first < 0 || second < 0 || third < 0){
            return "Invalid Value";
        }else if(first == second && second == third){
            return "All numbers are equal";
        }else if(first != second && first != third && second != third){
            return "All numbers are different";
        }else{
            return "Neither all are equal or diferent";
        }
    }

}
