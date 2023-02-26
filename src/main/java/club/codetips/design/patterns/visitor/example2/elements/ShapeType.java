package club.codetips.design.patterns.visitor.example2.elements;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public enum ShapeType {

    SQUARE {
        @Override
        public <T> T visit(ShapeVisitor<T> visitor) {
            return visitor.visitSquare();
        }
    },
    RECTANGLE {
        @Override
        public <T> T visit(ShapeVisitor<T> visitor) {
            return visitor.visitRectangle();
        }
    },
    TRIANGLE {
        @Override
        public <T> T visit(ShapeVisitor<T> visitor) {
            return visitor.visitTriangle();
        }
    };


    public abstract <T> T visit(ShapeVisitor<T> visitor);

    public interface ShapeVisitor<T> {
        T visitSquare();

        T visitRectangle();

        T visitTriangle();
    }
}
