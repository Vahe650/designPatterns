package LiskovSubstitutionPrinciple;

public class Demo {

    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setheight(10);
//        area = width *10
        System.out.println("Expected area of " + (width * 10) + " , got  " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        Rectangle rectangle1 = RectangleFactory.newRectangle(5, 5);
        useIt(rectangle1);
    }
}
