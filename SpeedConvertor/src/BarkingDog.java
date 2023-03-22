public class BarkingDog {

    public static boolean shouldWakeUp(boolean Barking, int hourOfDay) {
        if (Barking == false || hourOfDay < 0 || hourOfDay > 23) {
            return false;
          //  System.out.println("false");
        } else if (Barking == true && hourOfDay >= 0 && hourOfDay < 8) {
            return true;
          //  System.out.println("true");
        } else if (Barking == true && hourOfDay > 22 && hourOfDay <= 23) {
            return true;
          //  System.out.println("true");
        }
    else return false;

}
}

