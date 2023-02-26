package club.codetips.design.patterns.visitor.example1.visitors;

import club.codetips.design.patterns.visitor.example1.elements.Circle;
import club.codetips.design.patterns.visitor.example1.elements.Rectangle;
import club.codetips.design.patterns.visitor.example1.elements.Triangle;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public interface ShapeVisitor<T> {

    T visitCircle(Circle circle);

    T visitRectangle(Rectangle rectangle);

    T visitTriangle(Triangle triangle);

}
