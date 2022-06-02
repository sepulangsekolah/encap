class EncapsulationTest { // class EncapsulationTest
    private String nama; // variabel nama
    private String alamat; // variabel alamat
    private int umur; // variabel umur

    public String getNama() { // method getNama
        return nama; // mengembalikan nilai nama
    }
    public String getAlamat() { // method getAlamat
        return alamat; // mengembalikan nilai alamat
    }
    public int getUmur() { // method getUmur
        return umur; // mengembalikan nilai umur
    }
    public void setNama(String nama) { // method setNama
        this.nama = nama; // mengisi nilai nama
    }
    public void setAlamat(String alamat) { // method setAlamat
        this.alamat = alamat; // mengisi nilai alamat
    }
    public void setUmur(int umur) { // method setUmur
        this.umur = umur; // mengisi nilai umur
    }
}