package club.codetips.design.patterns.visitor.example2;


import club.codetips.design.patterns.visitor.example2.elements.BaseShape;
import club.codetips.design.patterns.visitor.example2.elements.RectangleShape;
import club.codetips.design.patterns.visitor.example2.elements.SquareShape;
import club.codetips.design.patterns.visitor.example2.elements.TriangleShape;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class Test {

    public static void main(String[] args) {
        BaseShape[] shapes = {
                new SquareShape(5.0d),
                new RectangleShape(4, 6),
                new TriangleShape(3, 4)};

        for (BaseShape shape : shapes) {
            Double area = shape.getShapeType().visit(new AreaVisitor(shape));
            System.out.println("Area of shape " + shape.getShapeType() + " is " + area);
        }
    }
}
