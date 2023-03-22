public class MinSec {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {

        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41L));
        System.out.println(getDurationString(65, 9));
    }
    private static String getDurationString(long minutes, long seconds){
        if(minutes < 0 || ((seconds < 0) || (seconds > 59))){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes/ 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minuteString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        String secString = seconds + "s";
        if(seconds < 10) {
            secString = "0" + secString;
        }
        return  hoursString + " " + minuteString + " " + secString + "";
    }
    private static String getDurationString(long seconds){
        if(seconds < 0 ) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        String x = getDurationString(minutes, remainingSeconds);
        return x;
    }
}
