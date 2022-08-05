public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0)
            throw new IllegalArgumentException("Width must be positive");
        if (height <= 0)
            throw new IllegalArgumentException("Height must be positive");

        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return width * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
