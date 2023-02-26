package club.codetips.design.patterns.visitor.example2.elements;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public abstract class BaseShape {
    public ShapeType shapeType;

    public ShapeType getShapeType() {
        return shapeType;
    }

    protected BaseShape(ShapeType shapeType){
        this.shapeType = shapeType;
    }
}
