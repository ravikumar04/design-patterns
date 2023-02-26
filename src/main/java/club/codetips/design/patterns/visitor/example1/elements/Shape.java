package club.codetips.design.patterns.visitor.example1.elements;

import club.codetips.design.patterns.visitor.example1.visitors.ShapeVisitor;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public interface Shape {
    <T> T accept(ShapeVisitor<T> visitor);
}
