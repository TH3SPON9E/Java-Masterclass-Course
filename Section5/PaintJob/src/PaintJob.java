public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // Return 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Return 3

        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // Return 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // Return 14

        System.out.println(getBucketCount(3.4, 1.5)); // Return 3
        System.out.println(getBucketCount(6.25, 2.2)); // Return 3
        System.out.println(getBucketCount(3.26, 0.75)); // Return 5
    }

    public static int getBucketCount(double width, double height, double areaPerBucket,
                                      int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double paintHome = areaPerBucket * extraBuckets;
        double difference = area - paintHome;
        if(difference < 0) {
            return 0;
        }
        else {
            return (int) Math.ceil(difference / areaPerBucket);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double buckets = area / areaPerBucket;
        if(buckets < 0) {
            return 0;
        }
        else {
            return (int) Math.ceil(buckets);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double buckets = area / areaPerBucket;
        if(buckets < 0) {
            return 0;
        }
        else {
            return (int) Math.ceil(buckets);
        }
    }
}

