package universitas;

public class Mahasiswa {
    //membuat variabel
    String npm, nama, prodi;
    
    //membuat constructor
    public Mahasiswa (String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    //membuat method getDetail
    String setDetail(){
        return npm + nama + prodi;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
