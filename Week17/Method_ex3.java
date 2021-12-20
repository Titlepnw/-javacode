package Week17;

public class Method_ex3 {
    
    public static void main(String[] args) {
        //แบบที่3 ไม่มีการรับค่าที่ส่งมาจาก main progarm แต่ลุกส่งค่าคืนให้แม่
      int phone =  getPhoneNumber();
      System.out.println(getPhoneNumber());
      int lucky = 999;
      int newphone = phone+lucky;
      System.out.println(phone);
    }
           static int getPhoneNumber(){
               return 987654321;
        
    }
}
