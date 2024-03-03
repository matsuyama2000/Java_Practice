package math.geometry;
public class Point{
  // 類別屬性跟方法
  public static int ORIGIN_X = 0;
  public static int ORIGIN_Y = 0;
  public static void renderOrigin() {
    System.out.println(ORIGIN_X + ", " + ORIGIN_Y );
  }

  // 物件屬性、方法、建構式
  public int x;
  public int y;

  public Point(int xArg, int yArg) {
    this.x = xArg;
    this.y = yArg;
  }
  public void render() {
    System.out.println(this.x + ", " + this.y);
  }
}