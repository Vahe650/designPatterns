package LiskovSubstitutionPrinciple;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int size) {
        width=height=size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setheight(width);
    }

    @Override
    public void setheight(int heeight) {
        super.setheight(heeight);
        super.setWidth(heeight);
    }
}
