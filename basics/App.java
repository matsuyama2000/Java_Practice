import math.geometry.Point;

class App {
  public static void main(String[] args) {
    System.out.println(Point.ORIGIN_X);
    Point.renderOrigin();

    Point obj = new Point(3, 4);
    System.out.println(obj.x);
    obj.render();

    Point p2 = new Point(5, 6);
    System.out.println(p2.x);
    p2.render();
  }
}