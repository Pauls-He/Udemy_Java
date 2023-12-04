//import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket ){
        if (width<=0 || height<=0 || areaPerBucket<=0 || extraBucket<0){
            return -1;
        }
        double area = width * height;
        int buckets = (int) Math.ceil((area/areaPerBucket)- extraBucket);
        return buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width<=0 || height<=0 || areaPerBucket<=0){
            return -1;
        }
        double area = width*height;
        int buckets = (int)Math.ceil(area/areaPerBucket);
        return buckets;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (areaPerBucket<=0 || area<=0){
            return-1;
        }
        int buckets = (int)Math.ceil(area/areaPerBucket);
        return buckets;
    }
}
