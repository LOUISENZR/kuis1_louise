public class Kerucut18 {
    private double t;
    private double r;

    public Kerucut18(double t, double r){
        this.t = t;
        this.r = r;
    }
    public void setTinggi(double t){
        this.t = t;
    }
    public double getTinggi(){
        return t;
    }
    public void setJariJari(double r){
        this.r = r;
    }
    public double getJariJari(){
        return r;
    }
    public double volume(){
        return (3.14 * r * r * t)/3;
    }
    public double LuasPermukaan(){
        double s = Math.sqrt(Math.pow(r, 2) + Math.pow(t, 2));
        return 3.14 * r * (s+r);
    }
}
