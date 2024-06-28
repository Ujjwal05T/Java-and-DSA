package college.assignment;
class Rectangle {
    int length;
    int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    void calcArea(){
        System.out.printf("\nArea of This Rectangle = %d",length*width);
    }
    void calcPerimeter(){
        System.out.printf("\nPerimeter of This Rectangle = %d",2*(length+width));
    }
}
public class Eighth {
    public static void main(String[] args) {
        Rectangle A = new Rectangle();
        A.setLength(25);
        A.setWidth(35);
        A.calcArea();
        A.calcPerimeter();
    }
}
