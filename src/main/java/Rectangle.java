public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.getLength() * this.getWidth();
    }

    public int getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    public double getDiagonal() {
        return Math.sqrt(this.getLength() * this.getLength()
                + this.getWidth() * this.getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
