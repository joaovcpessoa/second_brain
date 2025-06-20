public class RectangleArea {
  public static void main(String[] args) {
    calculateArea();
  }

  public static void calculateArea() {
    int length = 5;
    int width = 10;
    int area;

    area = length * width;
    System.out.println("Calculating the area of a rectangle:");
    System.out.println("Given dimensions:");
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Area of the rectangle: " + area);
  }
}
