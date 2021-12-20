package Week13;

public class StrindMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Sittirat";
        String lastname2 = "Sittirat";

        //เปรียบเทียบเท่ากัน .equals()
        boolean result = lastname1.equals(lastname2);
        //System.out.println(result);
        
        //เปรียบเทียบเท่ากันไม่สนใจตัวอัการ .equals
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);
    
        if (result) {
            System.out.println(lastname1 + "เท่ากับ" + lastname2);

        } else {
            System.out.println(lastname1 + "ไม่ท่ากับ" + lastname2);

        }
    }
}
