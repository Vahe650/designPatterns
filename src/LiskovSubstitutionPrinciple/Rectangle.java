package LiskovSubstitutionPrinciple;

public class Rectangle {

    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public int getArea(){
       return width*height;
    }

    public boolean isSquare(){
        return width==height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
