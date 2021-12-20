package Week15;

public class Array_InsertOddNumber {
    public static void main(String[] args) {
      int  [] x = new int[10];
      //System.out.println(x.length); //ดูว่าได้กี่ช่อง
      for (int i = 0; i < x.length; i++) {
          System.out.print(x[i]+ " "); //แสดงผลArrayก่อนเพิ่มข้อมุล
      }
      //แสดงผลArrayเริ่มเพิ่มข้อมูล
      int number=1;
      for (int i = 0; i < x.length; i++) {
          x[i] = number;
          number = number+2;
      }
      System.out.println();
      for (int i = 0; i < x.length; i++) {
        System.out.print(x[i]+ " "); //แสดงผลArrayหลังเพิ่มข้อมูล
    }

}
}
