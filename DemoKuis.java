public class DemoKuis {
    public static void main(String[] args) {
        Mesin mesinH = new Mesin("Honda");
        Mesin mesinY = new Mesin("Yamaha");

        SepedaMotor honda = new SepedaMotor("Vario",mesinH);
        System.out.println(honda.getMerek());
        System.out.println(honda.getMerekMesin());
        honda.tambahKecepatanMotor();
        System.out.println(mesinH.getKecepatan()+" Km/Jam");
        honda.tambahKecepatanMotor();
        System.out.println(mesinH.getKecepatan()+" Km/Jam");
        honda.kurangiKecepatanMotor();
        System.out.println(mesinH.getKecepatan()+" Km/Jam");

        System.out.println();
        SepedaMotor yamaha = new SepedaMotor("NMX",mesinY);
        System.out.println(yamaha.getMerek());
        System.out.println(yamaha.getMerekMesin());
        yamaha.tambahKecepatanMotor();
        System.out.println(mesinY.getKecepatan()+" Km/Jam");
        yamaha.tambahKecepatanMotor();
        System.out.println(mesinY.getKecepatan()+" Km/Jam");
        yamaha.kurangiKecepatanMotor();
        System.out.println(mesinY.getKecepatan()+" Km/Jam");
    }
}
