package shape;

public abstract class Path extends Shape{
    
    ArrayList<PathOp> pathOperations = new ArrayList<>();

    public Path(final String label){
        super(label);
    }
}
