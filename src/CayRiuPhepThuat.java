public class CayRiuPhepThuat extends VatPham{
    public CayRiuPhepThuat() {
        super.setTenVP("Cay Riu Phep Thuat");
    }

    @Override
    public double succongpha() {
        return this.chisoSM*this.hesoSM;
    }

    @Override
    public double soVangcan() {
        return this.hesoSM*this.chisoSM*this.vang;
    }
}
