package svg.pathop;

import svg.path;


public abstract class  PathOp extends Path {

protected char label;
protected boolean absolute;

public PathOp(final String label){
super(label);
}


}
