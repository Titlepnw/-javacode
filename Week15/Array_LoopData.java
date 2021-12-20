package Week15;

public class Array_LoopData {
    public static void main(String[] args) {
        String[] car = {"BMW","Tesra","Kubota","Yamaha"};
        
      //วนลูปแสดงค่าข้อมูลในArray
      for (int i = 0; i < car.length; i++) {
          System.out.println("สมาชิกตำแหน่งที่ "+ i + "มีค่าเท่ากับ " + car[i]);
      }



      for (int i = 0; i < car.length; i++) {
        System.out.println("สมาชิกช่องที่ "+ (i+1) +"มีค่าเท่ากับ" + car[i]);
    }
        // System.out.println(0);
        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
    }
}
