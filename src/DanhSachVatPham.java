import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    List<VatPham> vatPhamList;
    Scanner sc;
    public DanhSachVatPham(){
        vatPhamList = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void nhap(){
        try {
            System.out.println("Chon vat pham muon nhap:");
            System.out.println("1. Chiec bua than");
            System.out.println("2. Bao tay sam set");
            System.out.println("3. Hon da kich no");
            System.out.println("4. Cay riu phep thuat");
            System.out.println("5. Cay gay chien than");
            System.out.println("################");
            int flag = sc.nextInt();
            VatPham vp = null;
            if(flag == 1){
                vp = new ChiecBuaThan();
                vp.nhap();
                vp.setSucCP(vp.succongpha());
                vp.setSoVang(vp.soVangcan());
            } else if (flag == 2) {
                vp = new BaoTaySamSet();
                vp.nhap();
                vp.setSucCP(vp.succongpha());
                vp.setSoVang(vp.soVangcan());
            } else if (flag == 3) {
                vp = new HonDaKichNo();
                vp.nhap();
                vp.setSucCP(vp.succongpha());
                vp.setSoVang(vp.soVangcan());
            } else if (flag == 4) {
                vp = new CayRiuPhepThuat();
                vp.nhap();
                vp.setSucCP(vp.succongpha());
                vp.setSoVang(vp.soVangcan());
            } else if(flag == 5){
                vp = new CayGayChienThan();
                vp.nhap();
                vp.setSucCP(vp.succongpha());
                vp.setSoVang(vp.soVangcan());
            }
            vatPhamList.add(vp);
        }catch (InputMismatchException e){
            System.out.println("Vui long nhap lai !!!");
            sc.next();
        }
    }
    public void maxVang(){
        double maxV = vatPhamList.stream()
                .mapToDouble(item -> item.soVang)
                .max()
                .orElse(0);
        vatPhamList.stream()
                .filter(item -> item.soVang == maxV)
                .forEach(item -> {
                    System.out.println(item.toString());
                    System.out.println("So vang: " + item.soVang);
                });
    }
    public void cau4(){
        try{
            System.out.println("Nhap vao so vang Spon thu phap duoc: ");
            double vangCuudongdoi = sc.nextDouble();
            double tongVang = vatPhamList.stream()
                    .mapToDouble(item -> item.soVang)
                    .sum();
            if(vangCuudongdoi >= tongVang){
                System.out.println("Spon da giai cuu thanh cong dong doi!!!");
                System.out.println("Tong so vang can de giai cuu: " + tongVang);
                System.out.println("So vang hien co: " + vangCuudongdoi);
            } else {
                System.out.println("Voi so vang hien tai Spon khong the giai cuu dong doi");
                System.out.println("Tong so vang can de giai cuu: " + tongVang);
                System.out.println("So vang hien co: " + vangCuudongdoi);
                System.out.println("Con thieu vang: " + (tongVang - vangCuudongdoi));
            }
        }catch (InputMismatchException e){
            System.out.println("Vui long nhap lai!!!");
            sc.next();
        }

    }
    public void xuat(){
        for(VatPham vp : vatPhamList){
            System.out.println(vp.toString());
        }
    }

}
