package Week13;

public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname = "   Panuwat Sittirat   ";
        int count = fullname.length();
        System.out.println(count);
        System.out.println("before => " +fullname);

        // .trim() ตัดช่องว่างหน้าหลังออก
        String result = fullname.trim();
        System.out.println("after ==>"+ result);
        System.out.println(result.length());

        //.indexof() แสดงผลตำแหน่งที่ขิงอักษร
        System.out.println(fullname.indexOf("at", 9));

        // .toUpperCase()       .toLowerCase()
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());

        // .substring()  การตัดคำที่ต้องการ
        String uni = "Nakhon Pathom Rajabhat University";
        //System.out.println(uni.);

    }
}
