package inheritance;

// Super Class / Parent Class / Base Class
class Member{
        String nama;
        int umur; 
        
        public Member(String name, int umur){
            this.nama = name;
            this.umur = umur;
        }
        
        public void setUmur(int umur){
            this.umur=umur;
        }
        
        public void display(){
            System.out.println("MEMBER");
            System.out.println("Nama                        : " +nama);
            System.out.println("Umur (dalam tahun)          : " +umur);
            System.out.println();
        }
    }

// sub class
class Trainee extends Member{
        int lamaTraining;
        public Trainee(String nama, int umur, int lamaTraining){
            super(nama, umur);
            this.lamaTraining = lamaTraining;
        }
        
        int getLamaTraining()
        {
            return lamaTraining;
        }
        @Override
        public void display(){
            System.out.println("TRAINER");
            System.out.println("Nama                        : "+nama);
            System.out.println("Umur (dalam tahun)          : "+umur);
            System.out.println("Lama Training (dalam bulan) : "+lamaTraining);
            System.out.println();    
    }
}

// sub class
class Tim {
        String nama;
        String getNama()
        {
            return nama;
        }
        void setNama(String nama){
            this.nama=nama;
        }
        Member m[];
        void setMember(Member[] m){
            this.m=m;
        }         
        void displayFullMember(){
            for(int i=0;i<m.length;i++){
                m[i].display();
            }  
        }
    }

public class Inheritance {

    public static void main(String[] args) {
    System.out.println("Program Class Diagram Inheritance (Pewarisan)");
    System.out.println();
        
    Member m[]=new Member[3];
        m[0] = new Member("Muhammad Ladzi Safroni",19);
        m[1]= new Member("Fachrul Rochmah Agustina",17);
        m[2]= new Trainee("Septiyani Wulandari",21,10);
        Tim noob = new Tim();
        noob.setMember(m);
        noob.displayFullMember();
    
    System.out.println();
    System.out.println("Program By : Muhammad Ladzi Safroni | 074 | D4 MI 2019B");
    System.out.println();
    }
}
