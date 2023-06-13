package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Mahasiswa koko = new Mahasiswa("2110010579", " Muhammad Koko Saputro", " Teknik Informatika");
        
        //memanggil method getDetail
        System.out.println(koko.setDetail());
    }
}
