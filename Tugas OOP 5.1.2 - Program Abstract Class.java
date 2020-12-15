package pkgabstract;

abstract class Robot {
    String nama;
    String pemilik;
    int tahun;
    
    public void setTahunPembuatan(int tahun){
        this.tahun = tahun;
    }
    
    public void setPemilik(String Pemilik){
        pemilik = Pemilik;
    }
    
    public abstract void setNama(String nama);
    
    public void dislayData(){
        System.out.println("Nama Robot      : "+nama);
        System.out.println("Pemilik Robot   : "+pemilik);
        System.out.println("Tahun           : "+tahun);
    }
}

class DoraMini extends Robot{

    public void sayDora(){
        System.out.println("Halo, Nama Saya Dora Mini.");
    }
    
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        System.out.println("Program Abstract Class");
        System.out.println();
        
        DoraMini Robot = new DoraMini();
        Robot.setNama("Dora Mini");
        Robot.setPemilik("Nobita Nobi");
        Robot.setTahunPembuatan(2001);
        Robot.sayDora();
        Robot.dislayData();
        
        System.out.println();
        System.out.println("Program By : Muhammad Ladzi Safroni | 074 | D4 MI 2019B");
        System.out.println();
    }
}
