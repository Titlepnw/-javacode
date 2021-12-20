package Week15;

public class Homework15 {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย เข็มขัด", "นางสมศรี มีมาก", "นางสมนาค มากหนี", "นายโอ จันอังคาร","นางสาวสมอน ทองยิ้ม" };
        System.out.println("มีรายชื่อประกอบ" + name.length + "คน");
        
        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].startsWith("นาย");
            if (check) {
                System.out.println((i+1) +name[i] + " ==> " +  "เพศชาย");
            } else {
                System.out.println( (i+1) +name[i] + " ==> " + "เพศหญิง"); 
            }
        } 
    }
}