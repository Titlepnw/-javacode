package Week13;

public class Stringmethod_Str2Int {
    public static void main(String[] args) {
        String s1 = "500";
        String s2 = "300.5";
        int num1 = 100;

        System.out.println(s1+num1);
        //Intger.parseInt() แปลงสตริงเป็นเลขจำนวน

      int num2 = Integer.parseInt(s1);
      double num3 = Double.parseDouble(s2);
      System.out.println(num3+num1);
    }
}
