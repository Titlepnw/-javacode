package Week15;



public class Array_Basic01 {
    public static void main(String[] args) {
        // การประกาสตัวแปรแบบArray
        // แบบที่1 : การประกาศแบบกำหนดสมาชิก
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int size = number.length;
        System.out.println(size); // หาความยาวของArray
        System.out.println(number[3]); // การเข้าถึงตำแหน่งของตัวแปร
        number[3] = 99; // การเปลื่ยนค่าข้อมุลในตัวแปร
        System.out.println(number[3]);

        // แบบที่2 : การประกาศแบบกำหนดขนาด
        //char[] alphabet; //การประกาศArray
        //alphabet = new char[26];          //สร้างArray
       char [] alphabet = new char [26]; //ประกาศArray & สร้าง Array
        alphabet [0] = 'a';
        alphabet [1] = 'b';
        alphabet [2] = 'c';
        //char[] alphabet = {'a','b','c'}
        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);

        int [] num = new int [10];
        System.out.println(num[9]);
        
}
}
