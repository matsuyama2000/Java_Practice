public class DataTypeConversion {
  public static void main(String[] args) {
    // double > float > long > int > short > byte
    // 小範圍到大範圍，自動轉換成功
    byte x = 3;
    int y = x; // byte 轉換成 int
    System.out.println(y);

    long z = y; // int 轉換成 long
    System.out.println(z);

    // 大範圍到小範圍，需使用（資料型態）做強制轉換
    int k = 3;
    byte m = (byte)k;
    System.out.println(m);

    // float f = 3.141592689; // 錯誤：試圖把 double 轉換成 float
    float f = (float)3.141592689;
    System.out.println(f);

    // 字串轉換成數字
    String text = "22";
    int i = Integer.parseInt(text);
    System.out.println(i);

    String homework = "3.1415";
    double d = Double.parseDouble(homework);
    System.out.println(homework);

    // 數字轉換成字串
    int money = 34;
    String s = String.valueOf(money);
    System.out.println(s);

    long age = 50;
    String a = String.valueOf(age);
    System.out.println(a);
  }
}