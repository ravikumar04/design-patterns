package club.codetips.design.patterns.visitor.example1.elements;

import club.codetips.design.patterns.visitor.example1.visitors.ShapeVisitor;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visitTriangle(this);
    }
}
