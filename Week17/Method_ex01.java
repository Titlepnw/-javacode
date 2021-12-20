package Week17;

public class Method_ex01 {
    public static void main(String[] args) {
        //method แบบที่1 ไม่มีการส่งค่าจาก method main และ ไม่มีการคืนค่า
        openFile();
        playFile();
        pauseFile();
        closeFile();
        
    }
    static void openFile(){
        System.out.println("openFile");
    }

static void playFile(){
    System.out.println("play Music");
}
static void pauseFile(){
    System.out.println("play Music");
}
static void closeFile(){
    System.out.println("stop Music");
}
}