package Week05;
import java.util.Scanner;
public class inputDataFromKeybaord {
    public static void main(String[] args) {
         // nextByte nextShort nextInt nextLong nextFloat nextDouble
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนรหัสนักศึกษา :  ");
        String id = kb.nextLine();
        System.out.print("กรุณาป้อนชื่อ-นามสกุล :  ");
        String name = kb.nextLine();
        System.out.print("กรุณาป้อนปีเกิด :  ");
        int year = kb.nextInt(); 
        System.out.print("ผลการเฉลี่ย :  ");
        float GPA = kb.nextFloat();
        int age = 2564-year;

      
       
        System.out.println("รหัสที่ป้อนคือคือ " +id); 
        System.out.println("ชื่อ-นามสกุลที่ป้อนคือ " +name);
        System.out.println("อายุที่ป้อนคือ " +age);
        System.out.println("ผลการเฉลี่ยคือ " +GPA);
        System.out.println();
        System.out.println(id+"  "+name+"  "+age+"  "+GPA);
        kb.close();
        
    }
}
