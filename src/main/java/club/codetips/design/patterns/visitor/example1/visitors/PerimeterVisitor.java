package club.codetips.design.patterns.visitor.example1.visitors;

import club.codetips.design.patterns.visitor.example1.elements.Circle;
import club.codetips.design.patterns.visitor.example1.elements.Rectangle;
import club.codetips.design.patterns.visitor.example1.elements.Triangle;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class PerimeterVisitor implements ShapeVisitor<Double> {

    public Double visitCircle(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public Double visitRectangle(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    public Double visitTriangle(Triangle triangle) {
        return triangle.getBase() + 2 * Math.sqrt(triangle.getBase() * triangle.getBase() / 4
                + triangle.getHeight() * triangle.getHeight());
    }

}
