public class NumberToWords {
    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println("*************************");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("*************************");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }
    public static void numberToWords( int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int digCount = getDigitCount(number);
        int cNum =reverse(number);
        for(int idx = 0; idx< digCount; idx++) {
            switch(cNum%10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            cNum/=10;
        }
    }
    public static int getDigitCount(int number) {
        if(number < 0){
            return -1;
        }
        int count = 1;
        while(number/10 >0){
            number/=10;
            count++;
        }
        return count;
    }
    public static int reverse(int number) {
        boolean isNeg = false;
        if(number<0) {
            number *= -1;
            isNeg=true;
        }
        int oNum=0;
        while(number>0){
            oNum*=10;
            int digit = number % 10;
            oNum+=digit;
            number/=10;
        }
        return isNeg ? oNum*=-1 : oNum;
    }
}