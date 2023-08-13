public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(20);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
//        long milesPerHour = Math.round(kilometersPerHour / 1.609);
//        return milesPerHour;
//        else if (kilometersPerHour > 0) {
//            System.out.println("");
//        }
    }
    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " +
                    milesPerHour + " mi/h");

        }
    }
}
