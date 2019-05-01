package shape;
import java.util.*;
import javafx.scene.shape.Polyline;
import svg.SVGParser;
import svg.shape.Point2D;
import svg.element.Element;

//-----------------------------------------------------------------------------

/**
 * Concrete class for Polygon .
 * @author Manh Dao - Student ID: 6191346
 */
public class Polygon extends Polyline {

    private ArrayList<Point2D> points = new ArrayList<Point2D>();

    public Polygon() {
        super("polygon");
    }

    public Element newInstance() {
        return (Element) new Polygon();
    }

    @Override


    public boolean load(final String expr) {
        if (expr.contains(" points=")) {
            List<Double> pairs = new ArrayList<Double>();
            Double result = SVGParser.extractDoubleAt(expr,17);
            int index = 17;
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
    public String toString() {

        String str = "";
        System.out.print("polygon: ");
        for (int i = 0; i < points.size(); i++) {
            str+= points.get(i).toString();
        }
        return str;
    }

    public static void main(String []args) {
        Shape.updateRegistry(new Polygon());
    }


}
