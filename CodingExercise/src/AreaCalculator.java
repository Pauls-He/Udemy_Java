public class AreaCalculator {
    public static void main(String[] args) {
area(1);
area(2);
area(1,1);
area(2,2);
    }
    public static double area (double radius) {
        double circleArea = (radius * radius) * Math.PI;
        if (radius < 0) {
            return -1;
        } else {
            System.out.println(circleArea);
        } return circleArea;


    }
    public static double area (double x, double y) {
        double areaValue = x * y;
        if (x < 0 || y < 0) {
            return -1;
        } else {
            System.out.println(areaValue);
        } return areaValue;
    }
}
