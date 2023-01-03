package com.company;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (!isValid(width) || !isValid(height) || !isValid(areaPerBucket) || !isValid(extraBuckets)) {
            return -1;
        }

        double totalArea = width * height;
        return getBucketCount(totalArea, areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (!isValid(width) || !isValid(height) || !isValid(areaPerBucket)) {
            return -1;
        }

        double totalArea = width * height;
        return getBucketCount(totalArea, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (!isValid(area) || !isValid(areaPerBucket)) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }

    public static boolean isValid(double number) {
        return (number > 0);
    }

    /*
     * Math.round(3.24) = 3.0/3       input:float/double returns:float/double/long.
     * (int) Math.round(3.24) = 3     type cast to convert to int.
     * Math.round(3.78) = 4.0/4
     * (int) Math.round(3.78) = 4
     * Math.ceil(3.24) = 4.0          input:double returns: double only.
     * (int) Math.ceil(3.24) = 4      type cast to convert to int,float,long.
     */

}

