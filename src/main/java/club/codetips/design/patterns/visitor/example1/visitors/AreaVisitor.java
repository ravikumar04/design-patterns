package club.codetips.design.patterns.visitor.example1.visitors;

import club.codetips.design.patterns.visitor.example1.elements.Circle;
import club.codetips.design.patterns.visitor.example1.elements.Rectangle;
import club.codetips.design.patterns.visitor.example1.elements.Triangle;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class AreaVisitor implements ShapeVisitor<Double> {

    public Double visitCircle(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public Double visitRectangle(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public Double visitTriangle(Triangle triangle) {
        return 0.5 * triangle.getBase() * triangle.getHeight();
    }

}
