package club.codetips.design.patterns.visitor.example2.elements;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class RectangleShape extends BaseShape {
    private final double width;
    private final double height;

    public RectangleShape(double width, double height) {
        super(ShapeType.RECTANGLE);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
