package club.codetips.design.patterns.visitor.example1.elements;

import club.codetips.design.patterns.visitor.example1.visitors.ShapeVisitor;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visitCircle(this);
    }
}
