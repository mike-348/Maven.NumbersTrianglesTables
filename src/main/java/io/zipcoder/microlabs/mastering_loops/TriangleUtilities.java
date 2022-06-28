package io.zipcoder.microlabs.mastering_loops;

import java.util.concurrent.TransferQueue;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            s.append(TriangleUtilities.getRow(i));
            s.append('\n');
        }
        return s.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            s.append("*");
        }
        return s.toString();
//        String out = ""; //Ryan's demo
//        for (int i = 0; i < numberOfStars; i++) {
//            out += "*";
//        }
//        return null;
    }

    public static String getSmallTriangle() {
        String s = "";
        s = TriangleUtilities.getTriangle(5);
        return s;
    }

    public static String getLargeTriangle() {
        String s = "";
        s = TriangleUtilities.getTriangle(10);
        return s;
    }
}
