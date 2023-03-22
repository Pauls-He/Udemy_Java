public class AreaCalculator {
    public static void main(String[] args) {
    area(5.0);
    area(-1);
    area(5.0, 4.0);
    area(-1, 4.0);
    }
    public static double area (double radius){
        double circleArea = (radius * radius) * Math.PI;
        if(radius < 0) {
            return -1;
        }else {
            System.out.println(circleArea);
        } return circleArea;
    }
    public static double area (double x, double y) {
        double areaValue = x * y;
        if (x < 0 || y < 0){
            return -1;
        } else {
            System.out.println(areaValue);
        }return areaValue;
    }
}
