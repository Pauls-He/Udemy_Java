public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2001));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(4,2020));
        System.out.println(getDaysInMonth(12,10000));

    }
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) { // validation
            return false;
        }
        return (year % 4 == 0 &&
                (year % 100 != 0 || year % 400 == 0)); // test condition
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        switch (month){
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31; //all the other cases
        }
    }
}
