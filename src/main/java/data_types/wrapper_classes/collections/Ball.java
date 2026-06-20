package data_types.wrapper_classes.collections;


/**
class Ball {
    private final int diameter;
    private final String color;
    private final String material;

    public Ball(int diameter, String color, String material) {
        this.diameter = diameter;
        this.color = color;
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return diameter == ball.diameter && Objects.equals(color, ball.color) && Objects.equals(material, ball.material);
    }

    @Override
    public int hashCode() {
        int result = 17 * diameter;
        result = 31 * result + (color == null ? 0 : color.hashCode());
        result = 31 * result + (material == null ? 0 : material.hashCode());
        return result;
    }
}
*/

public record Ball(int id, String name, String color) {}
