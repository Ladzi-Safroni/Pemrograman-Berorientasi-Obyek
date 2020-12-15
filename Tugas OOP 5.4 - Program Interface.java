package pkginterface;

interface Robot {
    
    public void setNama(String nama);
    public void setTahunPembuatan(int tahun);
    public void dislayData();  
}

interface Doraemon {
    public void sayDora();
    public void dislayKantongAjaib();
}

class DoraMini implements Robot, Doraemon{
    String nama;
    String pemilik;
    int tahun;
    
    public String getPemilik(){
        return pemilik;
    }
    
    public void setPemilik(String Pemilik){
        pemilik = Pemilik;
    }
       
    public void sayDora(){
        System.out.println("Halo, Nama Saya Dora Mini.");
    }
    
    public void dislayKantongAjaib(){
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib.");
        System.out.println();
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setTahunPembuatan(int tahun){
        this.tahun = tahun;
    }
    
    public void dislayData(){
        System.out.println("Nama Robot      : "+nama);
        System.out.println("Pemilik Robot   : "+pemilik);
        System.out.println("Tahun           : "+tahun);
    }
}

public class Interface {

    public static void main(String[] args) {
        System.out.println("Program Interface");
        System.out.println();
        
        DoraMini Robot = new DoraMini();
        Robot.setNama("Dora Mini");
        Robot.setPemilik("Shizuka Minamoto");
        Robot.setTahunPembuatan(1988);
        Robot.sayDora();
        Robot.dislayKantongAjaib();
        Robot.dislayData();
        
        System.out.println();
        System.out.println("Program By : Muhammad Ladzi Safroni | 074 | D4 MI 2019B");
        System.out.println();   
    }
    
}
