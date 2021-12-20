package Week17;

public class Method_02 {
    public static void main(String[] args) {
    
        display ("กูจะตายห่าแล้ว");
        display ("จบไม่จบ");
       // plus("20,24");
    }
    static void plus (int num1, int num2){
        int result = num1+num2;
        System.out.println("ผลลัพธ์การบวก เท่ากับ " + result);
    }

    static void display (String x){
        System.out.println(x);
}
    static void fullname (String fname, int age){
    System.out.println(fname + "  " + age);
}
}