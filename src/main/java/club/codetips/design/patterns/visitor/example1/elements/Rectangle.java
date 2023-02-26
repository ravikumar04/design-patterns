package club.codetips.design.patterns.visitor.example1.elements;

import club.codetips.design.patterns.visitor.example1.visitors.ShapeVisitor;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visitRectangle(this);
    }
}
