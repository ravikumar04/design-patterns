package club.codetips.design.patterns.visitor.example1;

import club.codetips.design.patterns.visitor.example1.elements.Circle;
import club.codetips.design.patterns.visitor.example1.elements.Rectangle;
import club.codetips.design.patterns.visitor.example1.elements.Shape;
import club.codetips.design.patterns.visitor.example1.elements.Triangle;
import club.codetips.design.patterns.visitor.example1.visitors.AreaVisitor;
import club.codetips.design.patterns.visitor.example1.visitors.PerimeterVisitor;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class VisitorPattern {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(4, 6), new Triangle(3, 4)};

        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        for (Shape shape : shapes) {
            Double area = shape.accept(areaVisitor);
            System.out.println("Area: " + area);

            Double perimeter = shape.accept(perimeterVisitor);
            System.out.println("Perimeter: " + perimeter);
        }
    }

}
