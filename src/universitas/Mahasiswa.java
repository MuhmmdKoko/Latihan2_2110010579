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
}
