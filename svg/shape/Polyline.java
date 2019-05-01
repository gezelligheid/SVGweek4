package shape;
import java.util.*;
package svg.shape;
import svg.SVGParser;
import svg.shape.Point2D;
import svg.element.Element;

//-----------------------------------------------------------------------------

/**
 * Concrete class for Polyline .
 * @author Manh Dao - Student ID: 6191346
 */

public class Polyline extends Shape {
    public ArrayList<Point2D>  points = new ArrayList<Point2D>();

    public Polyline () {
        super("polyline");
    }

    public Polyline(final String label) {
        super(label);
    }

    public Element newInstance() {
        return (Element) new Polyline();
    }

    @Override

    public boolean load(final String expr) {
        List<Double> pairs = new ArrayList<Double>();
        if (expr.contains(" points=")) {
            Double result = SVGParser.extractDoubleAt(expr,18);
            int index = 18;
            pairs. add(result);
            while (!result.equals(null)) {
                String str = String.valueOf(result);
                index += str.length();
                result = SVGParser.extractDoubleAt(expr,index);
                if (pairs.size()==2) {
                    Point2D point = new Point2D(pairs.get(0),pairs.get(1));
                    points.add(point);
                    pairs.clear();
                }

                else {
                    pairs.add(result);
                }

            }

        }

        else {
            return false;
        }

        return true;
    }

    @Override

    public String toString()

    {
        String str = "";
        System.out.print("polyline: ");
        for (int i = 0; i < points.size(); i++) {
         str+= points.get(i).toString();
        }

        return str;
    }

    public static void main(String []args) {
        Shape.updateRegistry(new Polyline());
    }


}
