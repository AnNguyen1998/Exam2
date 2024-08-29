import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachVatPham dsvp = new DanhSachVatPham();
        Scanner sc = new Scanner(System.in);
        while (true){
            try{

                System.out.println("Menu");
                System.out.println("1. Nhap Vat pham");
                System.out.println("2. Xuat danh sach Vat pham");
                System.out.println("3. Vat pham ton nhieu xu vang nhat");
                System.out.println("4. Spon co giai cuu duoc dong doi cua minh khong?");
                System.out.println("5. Exit");
                int flag = sc.nextInt();
                if(flag == 1){
                    dsvp.nhap();
                } else if (flag == 2) {
                    dsvp.xuat();
                } else if (flag == 3) {
                    System.out.println("Vat pham ton nhieu xu vang nhat la: ");
                    dsvp.maxVang();
                } else if(flag == 4){
                    dsvp.cau4();
                } else if (flag == 5) {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Vui long nhap lai!!!");
                sc.next();

            }
        }
    }
}