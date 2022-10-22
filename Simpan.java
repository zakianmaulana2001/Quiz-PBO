public class Simpan {
    String no_anggota, nama, keterangan;
    Integer saldo;
 
    public Simpan(String no_anggota, String nama, Integer saldo, String keterangan) {
        this.no_anggota = no_anggota;
        this.nama = nama;
        this.saldo = saldo;
        this.keterangan = keterangan;
    }
 
    public String getNoAnggota() {
        return no_anggota;
    }
    
    public String getNama() {
        return nama;
    }
 
    public String getKeterangan() {
        return keterangan;
    }
 
    public Integer getSaldo() {
        return saldo;
    }
}
 