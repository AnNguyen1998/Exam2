import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class VatPham {
    protected String tenVP;
    protected double chisoSM;
    protected double hesoSM;
    protected double vang;
    protected double sucCP;
    protected double soVang;

    public VatPham() {
    }

    public VatPham(String tenVP, double vang, double hesoSM, double chisoSM, double sucCP, double soVang) {
        this.tenVP = tenVP;
        this.vang = vang;
        this.hesoSM = hesoSM;
        this.chisoSM = chisoSM;
        this.sucCP = sucCP;
        this.soVang = soVang;
    }

    public String getTenVP() {
        return tenVP;
    }

    public void setTenVP(String tenVP) {
        this.tenVP = tenVP;
    }

    public double getChisoSM() {
        return chisoSM;
    }

    public void setChisoSM(double chisoSM) {
        this.chisoSM = chisoSM;
    }

    public double getHesoSM() {
        return hesoSM;
    }

    public void setHesoSM(double hesoSM) {
        this.hesoSM = hesoSM;
    }

    public double getVang() {
        return vang;
    }

    public void setVang(double vang) {
        this.vang = vang;
    }

    public double getSucCP() {
        return sucCP;
    }

    public void setSucCP(double sucCP) {
        this.sucCP = succongpha();
    }

    public double getSoVang() {
        return soVang;
    }

    public void setSoVang(double soVang) {
        this.soVang = soVangcan();
    }

    public abstract double succongpha();
    public abstract double soVangcan();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap vao Chi so suc manh: ");
            this.chisoSM = sc.nextInt();
            System.out.println("Nhap vao He so suc manh: ");
            this.hesoSM = sc.nextDouble();
            System.out.println("Nhap vao So vang quy doi / 1 suc cong pha: ");
            this.vang = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Vui long nhap lai");
            sc.next();
        }

    }
    @Override
    public String toString() {
        return "-- Vat pham: " + this.tenVP + " -- Chi so suc manh: " + this.chisoSM + " -- He so suc manh: "
                + this.hesoSM + " -- So vang/ 1 Suc cong pha: " + this.vang +"\n" + "-- Suc cong pha: " + this.sucCP;
    }
}
