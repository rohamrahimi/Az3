public class Square extends Rectangle{
    public Square(double width) {
        super(width, width);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
