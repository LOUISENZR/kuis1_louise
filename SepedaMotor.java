public class SepedaMotor {
    private Mesin merekMesin;
    private String merekMotor;

    public SepedaMotor(String merekMotor, Mesin mesin) {
        this.merekMotor = merekMotor;
        this.merekMesin = mesin;
    }
    public void setMerek(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    public String getMerek() {
        return merekMotor;
    }
    public String getMerekMesin() {
        return merekMesin.getMerekMesin();
    }
    public void tambahKecepatanMotor() {
        merekMesin.tambahKecepatan(); 
    }
    public void kurangiKecepatanMotor() {
        merekMesin.kurangiKecepatanMotor();
    }
}
