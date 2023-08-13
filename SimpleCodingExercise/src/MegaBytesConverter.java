public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytsAndKiloBytes(2000);
    }
    public static void printMegaBytsAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabytes = (int) (kiloBytes/1024);
            int kiloRemainder = (int) kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " +
                    megabytes + " MB and " + kiloRemainder + " KB");
        }
    }
}
