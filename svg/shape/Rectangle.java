package shape;


import svg.SVGParser;
import svg.element.Element;

public class Rectangle extends Shape {

    private double x;
    private double y;
    private double rx;
    private double ry;
    private double width;
    private double height;

    public Rectangle() {
        super("rect");
    }

    public Element newInstance() {
        return (Element) new Rectangle();
    }

    public boolean load(final String expr) {

        if (expr.contains(" x=")) {
            final Double result = SVGParser.extractDouble(expr, " x=");

            if (result != null)
                x = result.doubleValue();
        } else {
            return false;
        }
        if (expr.contains(" y=")) {
            final Double result = SVGParser.extractDouble(expr, " y=");

            if (result != null)
                y = result.doubleValue();
        } else {
            return false;
        }
        if (expr.contains(" rx=")) {
            final Double result = SVGParser.extractDouble(expr, " rx=");

            if (result != null)
                rx = result.doubleValue();
        } else {
            return false;
        }
        if (expr.contains(" ry=")) {
            final Double result = SVGParser.extractDouble(expr, " ry=");

            if (result != null)
                ry = result.doubleValue();
        } else {
            return false;
        }
        if (expr.contains(" width=")) {
            final Double result = SVGParser.extractDouble(expr, " width=");

            if (result != null)
                width = result.doubleValue();
        } else {
            return false;
        }
        if (expr.contains(" height=")) {
            final Double result = SVGParser.extractDouble(expr, " height=");

            if (result != null)
                height = result.doubleValue();
        } else {
            return false;
        }

        return false;
    }

    public String toString() {
        return "rect: x=" +x + ", y=" + y + ", rx=" +rx + ", ry= " +ry + ", width=" + width + ", height=" + height;
    }

    public static void main(String []args) {
        Shape.updateRegistry(new Rectangle());
    }
}
