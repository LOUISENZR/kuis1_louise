public class Mesin {
    private String merekMesin;
    private double kecepatan;

    public Mesin(String merek){
        this.merekMesin = merek;
        this.kecepatan = 0;
    }
    public void setMerek(String merekMesin){
        this.merekMesin = merekMesin;
    }
    public String getMerekMesin(){
        return merekMesin;
    }
    public double getKecepatan(){
        return kecepatan;
    }
    public double tambahKecepatan() {
        if (merekMesin.equals("Honda")) {
            kecepatan += 10;            
        } else if (merekMesin.equals("Yamaha")) {
            kecepatan += 15;
        }

        if (kecepatan > 100) {
            kecepatan = 100;
        }
        return kecepatan;
    }
    public double kurangiKecepatanMotor() {
        if (merekMesin.equals("Honda")) {
            kecepatan -= 5;
        } else if (merekMesin.equals("Yamaha")) {
            kecepatan -= 10;
        } 

        if (kecepatan < 0) {
            kecepatan = 0;
        }

        return kecepatan;
    }

}
