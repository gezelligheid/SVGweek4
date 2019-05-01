package shape;


import svg.SVGParser;
import svg.element.Element;
import svg.shape.Shape;


public class Circle extends Shape {

    private double cx;
    private double cy;
    private double r;

    public Circle() {
        super("circle");
    }

    public Element newInstance() {
        return (Element) new Circle();
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

        if (expr.contains(" r="))
        {
            final Double result = SVGParser.extractDouble(expr, " r=");
            if (result != null)
                r = result.doubleValue();
        }
        else return false;

        return true;

    }




}
