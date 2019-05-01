package shape;


import svg.SVGParser;
import svg.element.Element;
import svg.shape.Shape;


public class Ellipse extends Shape {

    private double cx;
    private double cy;
    private double rx;
    private double ry;

    public Ellipse() {
        super("circle");
    }

    public Element newInstance() {
        return (Element) new Ellipse();
    }

    public boolean load(final String expr) {

        if (expr.contains(" cx="))
        {
            final Double result = SVGParser.extractDouble(expr, " cx=");
            if (result != null)
                cx = result.doubleValue();
        }

        else return false;

        if (expr.contains(" cy="))
        {
            final Double result = SVGParser.extractDouble(expr, " cy=");
            if (result != null)
                cy = result.doubleValue();
        }

        else return false;

        if (expr.contains(" rx="))
        {
            final Double result = SVGParser.extractDouble(expr, " rx=");
            if (result != null)
                rx = result.doubleValue();
        }
        else return false;

        if (expr.contains(" ry="))
        {
            final Double result = SVGParser.extractDouble(expr, " ry=");
            if (result != null)
                ry = result.doubleValue();
        }
        else return false;


        return true;

    }




}
