public class HonDaKichNo extends VatPham{
    public HonDaKichNo() {
        super.setTenVP("Hon Da Kich No");
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
