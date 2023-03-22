public class Switch {
    public static void main(String[] args) {
//        int value = 2;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        }else if(value == 2) {
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }
//        int switchValue = 5;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }
        //More code here

        char charValue = 'E';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case'D': case'E':
                System.out.println(charValue + " was found");

                break;
//            case 'D':
//                System.out.println("D was found");
//                break;
//            case 'E':
//                System.out.println("E was found");
//                break;
            default:
                System.out.println("Not Found");
                break;
        }
        String month = "JANUAry";
        switch(month.toLowerCase()) {
            case "january":
            System.out.println("Jan");
            break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
