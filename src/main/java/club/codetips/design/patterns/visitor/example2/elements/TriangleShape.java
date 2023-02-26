package club.codetips.design.patterns.visitor.example2.elements;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class TriangleShape extends BaseShape {

    private final double base;
    private final double height;

    public TriangleShape(double base, double height) {
        super(ShapeType.TRIANGLE);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

}
