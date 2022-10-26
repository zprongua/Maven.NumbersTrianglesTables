package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(4);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(9);
    }

    public static String getMultiplicationTable(int tableSize) {
        String timesTable = "";
        String timesTableRow = "";
        for (int y=1; y<=tableSize; y++) {
            for (int x=y; x<=y*tableSize; x+=y) {
                int holder = x;
                String rowColumn = Integer.toString(holder);
                timesTableRow += rowColumn.format("%3d",holder) + " |";
            }
            timesTable += timesTableRow + "\n";
            timesTableRow = "";
        }
        return timesTable;
    }
}
