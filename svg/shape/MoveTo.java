package shape;

public class MoveTo extends PathOp {

    private double x;
    private double y;
    public MoveTo() {
        super('M');
    }

    public void setX(double x) {
        this.x=x;
    }
    public void setY(double y) {
        this.y =y;
    }

    public String toString() {
        return "[M: x="+x+", y="+y+"]*";
    }


}
