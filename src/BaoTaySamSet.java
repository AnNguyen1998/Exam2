public class BaoTaySamSet extends VatPham{
    public BaoTaySamSet() {
        super.setTenVP("Bao Tay Sam Set");
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
