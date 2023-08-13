public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,-5));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(shouldWakeUp(true,4));
    }
    public static boolean shouldWakeUp(boolean Barking, int hourOfDay){
        if((Barking == false) || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }else if(Barking == true && hourOfDay >= 0 && hourOfDay < 8){
            return true;
        }else if(Barking == true && hourOfDay > 22 && hourOfDay <= 23){
            return true;
        }else{
            return false;
        }
    }
}
