package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String starTriangleTree = "";
        String starTriangleBranch = "";
        //create whole string
        for (int i=0; i<numberOfRows-1; i++) {
            //create each new line of whole string
            for (int j=0; j<i+1; j++) {
                starTriangleBranch += "*";
            }
            //add line break to branch, add branch to tree
            starTriangleTree += starTriangleBranch + "\n";
            //reset branch
            starTriangleBranch = "";
        }
        return starTriangleTree;
    }

    public static String getRow(int numberOfStars) {
        String starString = "";
        for (int i=0; i<numberOfStars; i++) {
            starString += "*";
        }
        return starString;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
