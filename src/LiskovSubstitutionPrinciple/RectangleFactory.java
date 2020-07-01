package LiskovSubstitutionPrinciple;

public class RectangleFactory {
    public static Rectangle newRectangle(int width,int heght){
        return new Rectangle(width, heght);
    }
    public static Rectangle newSquare(int side){
        return new Rectangle(side, side);
    }
}
