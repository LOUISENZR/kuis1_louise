public class MainKerucut {
    public static void main(String[] args) {
        Kerucut18 kerucut = new Kerucut18(12.0, 5.0);
        kerucut.volume();
        kerucut.LuasPermukaan();
        System.out.println("INI ADALAH BANGUN RUNAG KERUCUT"+"\nDengan:"
        +"\nTinggi = 12"+"\nJari-Jari = 5");
        System.out.println("Volume = "+kerucut.volume());
        System.out.println("Luas Permukaan = "+kerucut.LuasPermukaan()); 
    }
}
