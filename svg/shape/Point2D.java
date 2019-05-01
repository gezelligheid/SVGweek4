package svg.shape;
//-----------------------------------------------------------------------------

/**
 * Concrete class for Point2D .
 * @author Manh Dao - Student ID: 6191346
 */

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public String toString() {
        return "("+x+","+y+") ";
    }
}

