package shape;

import java.util.*;

public class Path extends Shape{
    
    ArrayList<PathOp> pathOperations = new ArrayList<>();

    public Path(){
        super("path");
    }

    public boolean load(String expr)

    {
        if (expr.contains("d=")) {
           final String str = svg.SVGParser.extractStringAt(expr,9 );

           if (str.contains('M')) {
               PathOp m = new MoveTo();
           }


    }
    }

    public static void main(String []args) {
        Shape.updateRegistry(new Path());
    }
}
