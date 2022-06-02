public class Encapsulation { // class encapsulation
    public static void main(String[] args) { // main method
        EncapsulationTest e = new EncapsulationTest(); // membuat object e
        e.setNama("Alif"); // mengisi nama
        e.setAlamat("Bandung"); // mengisi alamat
        e.setUmur(19); // mengisi umur
        System.out.println("Nama: " + e.getNama()); // menampilkan nama
        System.out.println("Alamat: " + e.getAlamat()); // menampilkan alamat
        System.out.println("Umur: " + e.getUmur()); // menampilkan umur
    }
}