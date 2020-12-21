package simulasi;

abstract class Permainan {
    String namaPemain;
    int levelPemain;
    private int hitungSkor;
       
    public void setNamaPemain(String namaPemain)
        {
            this.namaPemain = namaPemain;
        }
        
    public void setLevelPemain(int levelPemain)
        {
            this.levelPemain = levelPemain;
        }
        
    public String getNamaPemain()
        {
            return namaPemain;
        }
        
    public int getLevelPemain()
        {
            return levelPemain;
        }
        
    public void jalankan()
        {
            setNamaPemain("Muhammad Ladzi Safroni");
            setLevelPemain(80);
            System.out.println("Nama Pemain     : "+getNamaPemain());
            System.out.print("Level Pemain    : "+getLevelPemain()+" ");
            if(getLevelPemain() >= 1 && getLevelPemain() <=20 )
            {
                System.out.println("Normal");
            }
            else if (getLevelPemain() >=21 && getLevelPemain() <=80)
            {
                System.out.println("Medium");
            }
            else if(getLevelPemain() >=81 && getLevelPemain() <=100)
            {
                System.out.println("Hard");
            }
            System.out.println("Skor Permainan  : "+hitungSkor(5,3));
        }
        
    public abstract int hitungSkor(int hit, int miss);
}    
    class PermainanArcade extends Permainan {

    @Override
    public int hitungSkor(int hit, int miss) {
        return hit*3-miss*1;
    }
}
    
    class PermainanStrategy extends Permainan {

    @Override
    public int hitungSkor(int hit, int miss) {
        return hit*5;
    }  
}
 
public class SimulasiPermainan {   
    public static void main(String args[]){
        System.out.println("Aplikasi Simulasi Permainan");
        System.out.println();
        System.out.println("Permainan Arcade : ");
        Permainan arcade = new PermainanArcade();
        arcade.jalankan();
        System.out.println();
        System.out.println("Permainan Strategy : ");
        Permainan stategy = new PermainanStrategy();
        stategy.jalankan();
        System.out.println();
        System.out.println("Program By : Muhammad Ladzi Safroni | 074 | D4 MI 2019B");
        System.out.println();
    }
}
