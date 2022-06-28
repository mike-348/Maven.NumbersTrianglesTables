package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String s = TableUtilities.getMultiplicationTable(4);
        return s;
    };

    public static String getLargeMultiplicationTable() {
        String s = TableUtilities.getMultiplicationTable(10);
        return s;
    };

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                s.append(String.format("%3d |", i * j));
            }
            s.append("\n");
        }
        return s.toString();
    }
}
