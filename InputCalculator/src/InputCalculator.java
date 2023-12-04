import java.util.Scanner;



public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);

        long avg = 0;
        int sum = 0;
        int count=0;

        while(true){
            String num = sc.nextLine();
            try{
                int newNumber = Integer.parseInt(num);
                sum= sum + newNumber;
                count++;
            }
            catch(NumberFormatException nfe){
                break;
            }
        }
        if(count>=0){
            avg = Math.round((double)sum/count);
            System.out.println("SUM = " + sum + " AVG = " + avg );
        }
    }
}
