public class Linecomparision {
    public static void main(String[] args) {
        int x1Line1 = 1;
        int y1Line1 = 8;
        int x2Line1 = 3;
        int y2Line1 = 4;
        int x1Line2 = 2;
        int y1Line2 = 0;
        int x2Line2 = 5;
        int y2Line2 = 6;
        double lengthLine1 = Math.sqrt(Math.pow((x2Line1 - x1Line1), 2) + Math.pow((y2Line1 - y1Line1), 2));
        double lengthLine2 = Math.sqrt(Math.pow((x2Line2 - x1Line2), 2) + Math.pow((y2Line2 - y1Line2), 2));
        Double length1 = lengthLine1;
        Double length2 = lengthLine2;
        int comparisonResult = length1.compareTo(length2);
        if (comparisonResult == 0) {
            System.out.println("The lines are equal in length.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
}
