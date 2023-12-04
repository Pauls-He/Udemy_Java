import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double sum = 0;

        //while(true) {
        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if(counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number.");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}