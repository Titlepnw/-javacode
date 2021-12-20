package Week13;

import Week10.ifElse_Age;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นาย ภานุวัฒน์ สิทธิรัตน์";

        // หาตำแหน่งของค่าจากด้านหน้า .startsWith()
        boolean result = fullname.startsWith("นาย");
        if (result) {
            System.out.println(fullname + "เป้นเพศชาย");
        } else {
            System.out.println(fullname + "เป็นเพศหญิง");
        }

        // หาตำแหน่งของค่าจากด้านหลัง .endsWith()
        String code = "123456TH";
        boolean result1 = code.endsWith("TH");
        if (result1) {
            System.out.println("สินค้า" + code + "มาจากไทย");
        } else {
            System.out.println("สินค้า" + code + "ไม่ได้มาจากไทย");
        }

    }
}
