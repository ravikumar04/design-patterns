package club.codetips.design.patterns.visitor.example2.elements;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class SquareShape extends BaseShape {

    private Double side;

    public SquareShape(Double side) {
        super(ShapeType.SQUARE);
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
}
