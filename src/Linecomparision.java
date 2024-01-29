public class Linecomparision {
    public static void main(String args[]){
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 5.0;
        double y2 = 7.0;
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of the line segment is: " + length);
    }
}


