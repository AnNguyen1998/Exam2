public class CayGayChienThan extends VatPham{
    public CayGayChienThan() {
        super.setTenVP("Cay Gay Chien Than");
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
