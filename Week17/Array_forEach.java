package Week17;

public class Array_forEach {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย เข็มขัด", "นางสมศรี มีมาก", "นางสมนาค มากหนี", "นายโอ จันอังคาร","นางสาวสมอน ทองยิ้ม" };
        System.out.println("มีรายชื่อประกอบ" + name.length + "คน");
        int i=1;
        for (String showname : name) {
            System.out.println(i+". "+showname);
            i++;
        }
        int [] number = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int j : number) {
            sum = sum+j;
        }
        System.out.println(sum);
        // for (int i = 0; i < name.length; i++) {
        //     boolean check = name[i].startsWith("นาย");
        //     if (check) {
        //         System.out.println((i+1) +name[i] + " ==> " +  "เพศชาย");
        //     } else {
        //         System.out.println( (i+1) +name[i] + " ==> " + "เพศหญิง"); 
        //     }
        } 
    }
