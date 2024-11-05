package buoi7;
import java.util.Scanner;
public class buoi7 {
    
    public static float nhapDiem(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float diem = 0;
        while (true) {
            try {
                System.out.println("\nNhập điểm: ");
                diem = Float.parseFloat(sc.nextLine());
                if (diem >= 0 && diem <= 10) {
                } 
                else {
                   System.out.println("Số điểm nhập vào không hợp lệ!!!!"); 
                }

            } catch (Exception e) {
                // 2
                
                System.out.println("\nNhập lại");
              break;  
            }  
        }
        return diem;
    }
    public static void main(String[] args) {
        
        nhapDiem();
        
    }
    
}
