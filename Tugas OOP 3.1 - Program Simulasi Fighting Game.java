package simulasi.fighting.game;

import java.util.Scanner;

class gameCharacter
    {
        String name;
        int lifePoint, attackHitPoint, attackKickPoint; 
        
        public gameCharacter(String name, int attackHitPoint, int attackKickPoint)
        {
            this.name = name;
            this.lifePoint = 100;
            this.attackHitPoint = attackHitPoint;
            this.attackKickPoint = attackKickPoint;
        }
        
        void hit(gameCharacter player)
        {
            player.lifePoint = player.lifePoint-attackHitPoint;
        }
        
        void kick(gameCharacter player)
        {
            player.lifePoint = player.lifePoint-attackHitPoint;
        }
        
        String getName()
        {
            return name;
        }
        
        int getLifePoint()
        {
            return lifePoint;
        }
    }

public class SimulasiFightingGame {

    public static void main(String[] args) {
        gameCharacter Raiden = new gameCharacter("Raiden",10,20);
        gameCharacter SubZero = new gameCharacter("Sub-Zero",5,25);
        Raiden.kick(SubZero);
        SubZero.kick(Raiden);
        for(int i=0;i<3;i++)
        {
            SubZero.hit(Raiden);
        }
        for(int i=0;i<4;i++)
        {
            Raiden.kick(SubZero);
        }
        System.out.println("Program Simulasi Fighting Game");
        System.out.println();
        System.out.println("Life Point "+Raiden.getName()+" adalah "+Raiden.getLifePoint());
        System.out.println("Life Point "+SubZero.getName()+" adalah "+SubZero.getLifePoint());
        if(Raiden.getLifePoint()>SubZero.getLifePoint())
        {
            System.out.println("Pemenangnya adalah "+Raiden.getName());
        }
        else
        {
            System.out.println("Pemenangnya adalah "+SubZero.getName());
        }
        System.out.println();
        System.out.println();
        System.out.println("Program By : Muhammad Ladzi Safroni | 074 | D4 MI 2019B");
    }   
}
