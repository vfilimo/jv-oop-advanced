package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bigerSide;
    private int smallerSide;
    private int height;
    private String className = this.getClass().getSimpleName();

    public IsoscelesTrapezoid(int bigerSide, int smallerSide, int height, String color) {
        super(color);
        this.bigerSide = bigerSide;
        this.smallerSide = smallerSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (bigerSide + smallerSide) * height / 2;
    }

    @Override
    public String drawing() {
        return "Figure: " + className + ", "
                + "area: " + getArea() + " sq. units, "
                + "Biger side " + bigerSide + " units, "
                + "Smaller side " + smallerSide + " units, "
                + "Height " + height + " units, "
                + "color: " + getColor();
    }
}
