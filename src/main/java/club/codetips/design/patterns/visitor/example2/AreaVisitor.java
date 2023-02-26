package club.codetips.design.patterns.visitor.example2;

import club.codetips.design.patterns.visitor.example2.elements.BaseShape;
import club.codetips.design.patterns.visitor.example2.elements.RectangleShape;
import club.codetips.design.patterns.visitor.example2.elements.ShapeType;
import club.codetips.design.patterns.visitor.example2.elements.SquareShape;
import club.codetips.design.patterns.visitor.example2.elements.TriangleShape;

import java.awt.*;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class AreaVisitor implements ShapeType.ShapeVisitor<Double> {
    private final BaseShape shape;

    public AreaVisitor(BaseShape shape) {
        this.shape = shape;
    }

    @Override
    public Double visitSquare() {
        SquareShape squareShape = (SquareShape) shape;
        return squareShape.getSide() * squareShape.getSide();
    }

    @Override
    public Double visitRectangle() {
        RectangleShape rectangleShape = (RectangleShape) shape;
        return rectangleShape.getWidth() * rectangleShape.getHeight();
    }

    @Override
    public Double visitTriangle() {
        TriangleShape triangleShape = (TriangleShape) shape;
        return 0.5 * triangleShape.getBase() * triangleShape.getHeight();
    }
}
