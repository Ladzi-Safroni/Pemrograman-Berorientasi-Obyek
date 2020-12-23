package uaspbo;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {
    private int x;
    private int y;
    private int xArah;
    private int yArah;
    private ArrayList<musuh> musuh;
    private ArrayList<Makanan> makanan;
    private boolean Pemain;
    Image gambar;
    private Image background;
    private Image background2;
    Dimension size; 
    AudioClip soundTrack;
    AudioClip soundTrack2;
    int skor = 0;
    private boolean message;
    
     public void run() {
        
        while (true) {
            move();
           
            
            for (int i = 0; i < makanan.size(); i++) {
                Rectangle makananHitbox = makanan.get(i).getHitbox();
                Rectangle playerHitbox = getPlayerHitbox();
                if (makananHitbox.intersects(playerHitbox))
                    makanan.remove(i);
                    
                if(makananHitbox.intersects(playerHitbox)){
                    skor +=10;
                    
                if(makananHitbox.intersects(playerHitbox)){
                    soundTrack2 = Applet.newAudioClip(getClass().getResource("musik_makan.wav"));
                     soundTrack2.play();
                    }
                                       
                }
            }
            for (int i = 0; i < musuh.size(); i++) {
                Rectangle musuhHitbox = musuh.get(i).getHitbox();
                Rectangle playerHitbox = getPlayerHitbox();
                if (musuhHitbox.intersects(playerHitbox))
                    Pemain = false ;
               
            }
                              
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                System.err.println("Error: Thread Interrupted.");
            }
        }
    }
    
    private void move() {
        x += xArah;
        y += yArah;
        if (x < 0)
            x = 0;
        if (y < 20)
            y = 20;
        if (x > 580)
            x = 580;
        if (y > 440)
            y = 440;
    }
    
    Game() {
        
        setPreferredSize(size);
        setSize(640, 480);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setVisible(true);
        setTitle("UAS PBO - Game");
        x = 320;
        y = 240;
        xArah = 0;
        yArah = 0;
        addKeyListener(new KeyListener());
        
        musuh = new ArrayList<musuh>();
        makanan = new ArrayList<Makanan>();
        Pemain = true;
        size = new Dimension();
        background = new ImageIcon(this.getClass().getResource("background.jpg")).getImage();
        size.width = background.getWidth(null);
        size.height = background.getHeight(null);
        setPreferredSize(size);
        soundTrack = Applet.newAudioClip(getClass().getResource("musik.wav"));
        soundTrack.loop();
        
        
        
    }
    
    public void paint(Graphics g) {
        
        
        Image dbImg = createImage(getWidth(), getHeight());
        Graphics dbg = dbImg.getGraphics();
        draw(dbg);
        g.drawImage(dbImg, 0, 0, this);   
        
    }
    
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        
        if (Pemain) {
            Image serangga = new ImageIcon(this.getClass().getResource("kupu.gif")).getImage();
            g.drawImage(serangga, x, y, this);
  
        }
        
        for (int i = 0; i < musuh.size(); i++) {
            musuh e = musuh.get(i);
            e.draw(g);
        }
        
        for (int i = 0; i < makanan.size(); i++) {
            Makanan e = makanan.get(i);
            e.draw(g);
             
        }
        
        repaint();
        g2d.setFont(new Font("Arial",Font.BOLD,18));
		g2d.setColor(Color.WHITE);
		g2d.drawString("SCORE : " + Integer.toString(skor),20,50);
		g2d.setFont(new Font("Arial",Font.PLAIN,10));
		g2d.setColor(Color.GRAY);

    }
    
    public static Image loadImage(String fileName) {
        ImageIcon icon = new ImageIcon(fileName);
        return icon.getImage();
    }
     
    private void Lawanmusuh() {
        musuh e = new musuh();
        musuh.add(e);
        Thread t = new Thread(e);
        t.start();
    }
    
    private void munculMakanan() {
        Makanan e = new Makanan();
        makanan.add(e);
       Thread t = new Thread(e);
        t.start();
        
    }
    
    private Rectangle getPlayerHitbox() {
        return new Rectangle(x, y, 69, 42);
    }

    public static void main(String[] args) {
        Game gh = new Game();
        Thread t = new Thread(gh);
        t.start();
        while (true) {
            if (gh.musuh.size() < 15) {
                gh.Lawanmusuh();
            }
            if (gh.makanan.size() < 15) {
                gh.munculMakanan();
            }
            
            try {
                Thread.sleep(2500);
            } catch (InterruptedException ex) {
                System.err.println("Error: Thread Interrupted.");
            }
        }
    }
    
    private class KeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    yArah = -2;
                    break;
                case KeyEvent.VK_DOWN:
                    yArah = 2;
                    break;
                case KeyEvent.VK_LEFT:
                    xArah = -2;
                    break;
                case KeyEvent.VK_RIGHT:
                    xArah = 2;
                    break;
                default:
                    break;
            }
        }
        
        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                case KeyEvent.VK_DOWN:
                    yArah = 0;
                    break;
                case KeyEvent.VK_LEFT:
                case KeyEvent.VK_RIGHT:
                    xArah = 0;
                    break;
                default:
                    break;
            }
        } 
    }
}