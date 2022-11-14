public class Barang {
    private String kode, nama;
    public Barang(String kode,String nama){
        this.kode = kode;
        this.nama = nama;
    }
    public void TampilkanBarang(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama : "+nama );

    }


}
