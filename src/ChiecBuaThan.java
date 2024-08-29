public class ChiecBuaThan extends VatPham{

    public ChiecBuaThan() {
        super.setTenVP("Chiec Bua Than");
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
