package shape;
import svg.SVGParser;
import svg.element.Element;

public class line extends Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public line() {
        super("line");
    }

    public Element newInstance() {
        return new line();
    }

    public boolean load(final String expr) {

        if (expr.contains(" x1=")) {
            final Double result = SVGParser.extractDouble(expr, " x1=");
            if (result != null)
                x1 = result.doubleValue();

        } else return false;

        if (expr.contains(" y1=")) {
            final Double result = SVGParser.extractDouble(expr, " y1=");
            if (result != null)
                y1 = result.doubleValue();
        } else return false;

        if (expr.contains(" x2=")) {
            final Double result = SVGParser.extractDouble(expr, " x2=");
            if (result != null)
                x2 = result.doubleValue();
        } else return false;

        if (expr.contains(" y2=")) {
            final Double result = SVGParser.extractDouble(expr, " y2=");
            if (result != null)
                y2 = result.doubleValue();
        } else return false;

        return true;
    }
}

