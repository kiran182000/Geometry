public class Linecomparision {

    public static void main(String args[]){
        int x1Line1 = 0;
        int y1Line1 = 0;
        int x2Line1 = 3;
        int y2Line1 = 4;
        int x1Line2 = 0;
        int y1Line2 = 0;
        int x2Line2 = 3;
        int y2Line2 = 4;
        boolean areEqual = (x1Line1 == x1Line2 && y1Line1 == y1Line2 && x2Line1 == x2Line2 && y2Line1 == y2Line2);
        if (areEqual) {
            System.out.println("The lines are equal based on their end points.");
        } else {
            System.out.println("The lines are not equal based on their end points.");
        }
    }
}
