public class DataTypeConversion {
  public static void main(String[] args) {
    // double > float > long > int > short > byte
    // 小範圍到大範圍，自重轉換成功
    byte x = 3;
    int y = x; // byte 轉換成 int
    System.out.println(y);

    long z = y; // int 轉換成 long
    System.out.println(z);

    // 大範圍到小範圍，需使用（資料型態）做強制轉換
    int k = 3;
    byte m = (byte)k;
    System.out.println(m);

    // float f = 3.141592689; // 錯誤：試圖把double 轉換成 float
    float f = (float)3.141592689;
    System.out.println(f);
  }
}