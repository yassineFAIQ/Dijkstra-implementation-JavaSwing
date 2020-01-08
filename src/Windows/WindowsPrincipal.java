/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Windows;

import Classe.Arbres;
import Classe.Pint;
import Classe.Algorithme_Dijsktra;
import Classe.Algorithme_prime;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy_000
 */
public class WindowsPrincipal extends javax.swing.JFrame {
    
       
    /**
     * Creates new form VentanaPincipal
     */
   Pint pint =new Pint();
   Arbres arbres = new Arbres();    
   public static void R_repaint(int arret, Arbres arbres){//pinta lo q esta antes en el panel 
        for (int j = 0; j < arret; j++) {
            for (int k = 0; k < arret; k++) {
                if(arbres.getAdjacence(j, k) == 1)
                     Pint.pintLigne(jPanel1.getGraphics(),arbres.getCordeX(j),arbres.getCordeY(j), arbres.getCordeX(k), arbres.getCordeY(k),arbres.getCoefficient(j, k));
            }
        }
        for (int j = 0; j < arret; j++) 
            Pint.pintCircle(jPanel1.getGraphics(), arbres.getCordeX(j),arbres.getCordeY(j),String.valueOf(arbres.getNombre(j)));
                
   }
 
public static int EntrerNoeudOrigne(String noeudOrigine, String nonExiste,int arret){
    int NoeudOrigine = 0;
    //  try{
            NoeudOrigine = Integer.parseInt(JOptionPane.showInputDialog(""+noeudOrigine));   
            if(NoeudOrigine>=arret){  
                  JOptionPane.showMessageDialog(null,""+nonExiste+"\nIl faut entrer un noeud éxisté");
                  NoeudOrigine = EntrerNoeudOrigne(noeudOrigine,nonExiste, arret);
            }
     //  }catch(Exception ex){
          //  NoeudOrigine = EntrerNoeudOrigne(noeudOrigine,nonExiste,arret);
          
       // }
        return NoeudOrigine;
}          
 public  int creerTaille(String tama){        
        int taille = 0;
       // try{
            taille = Integer.parseInt(JOptionPane.showInputDialog(""+tama));
            if(taille<1){ JOptionPane.showMessageDialog(null,"Veuillez entrer une taille résonnable");
               taille = creerTaille(tama);//facultatif
            }
     //   }catch(Exception ex){
      //      taille = creerTaille(tama);
       // }
        return taille;
    }
 public boolean reNoeud(int xxx,int yyy){ 
     for (int j = 0; j < arret; j++) {// Veuillez cliquer sur un noeud 
            if((xxx+2) > arbres.getCordeX(j) && xxx < (arbres.getCordeX(j)+13) && (yyy+2) > arbres.getCordeY(j) && yyy<(arbres.getCordeY(j)+13) ) {
                                       
               if(n==0){
                   id = j;
                   R_repaint(arret,arbres);
                   Pint.cliqueSurNoeud(jPanel1.getGraphics(), arbres.getCordeX(j), arbres.getCordeY(j), null,Color.orange);       
                   n++;                   
               }
               else{ 
                   id2=j;                   
                   n++;
                   Pint.cliqueSurNoeud(jPanel1.getGraphics(), arbres.getCordeX(j), arbres.getCordeY(j), null,Color.orange);       
                   if(id==id2){// si id == id2 en cliquant à nouveau sur le même noeud, le clic précédent est annulé
                       n=0;
                       Pint.pintCircle(jPanel1.getGraphics(),arbres.getCordeX(id), arbres.getCordeY(id),String.valueOf(arbres.getNombre(id)));
                       id=-1;
                       id2=-1;
                   }
               } 
               nn=0;
                return true;              
            }
         }
     return false;
 }  
 public void cliqueSurNoeud(int xxx, int yyy){
            for (int j = 0; j <arret; j++) {
              if((xxx+2) > arbres.getCordeX(j) && xxx < (arbres.getCordeX(j)+13) && (yyy+2) > arbres.getCordeY(j) && yyy<(arbres.getCordeY(j)+13) ) {
                if(nn==0){
                   permanante =j; 
                   R_repaint(arret, arbres);                   
               }
               else{ noeudFin = j;}
                nn++;
                n=0;
                id =-1;
                Pint.cliqueSurNoeud(jPanel1.getGraphics(), arbres.getCordeX(j), arbres.getCordeY(j), null,Color.GREEN);  
                   break;
               }
           
            }
            
     
 }
 public void Image(File file){
  try{   
 
        BufferedImage read = ImageIO.read(file);
        Image scaledInstance = read.getScaledInstance(jmapa.getWidth(),jmapa.getHeight(), Image.SCALE_DEFAULT);
      
 jmapa.setIcon(new ImageIcon(scaledInstance));  
 }catch(Exception ex){
               JOptionPane.showMessageDialog(null,"Erreur de chargement d'image");
       }
 }
         

    public WindowsPrincipal() { 
        initComponents();
        jPanel2.setVisible(false);   
        jDialog1.setLocationRelativeTo(null);
        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jmapa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        distance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jFileChooser2.setMaximumSize(new java.awt.Dimension(21475, 21474));
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);
        jFileChooser2.setBounds(10, 20, 670, 390);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphe");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(141, 141, 141));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 522));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(null);

        jmapa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yassine Hero\\Downloads\\Compressed\\YassineFAIQ\\YassineFAIQ\\YassineFAIQ\\src\\plan-maroc2.jpg")); // NOI18N
        jPanel1.add(jmapa);
        jmapa.setBounds(40, 10, 711, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 10, 770, 520);

        jButton1.setText("Renouveler");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 410, 80, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(153, 153, 0));
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 10, 20, 20);

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setForeground(new java.awt.Color(153, 153, 0));
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(40, 10, 20, 20);

        jButton4.setBackground(new java.awt.Color(189, 182, 182));
        jButton4.setForeground(new java.awt.Color(153, 153, 0));
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(100, 10, 20, 20);

        jButton5.setBackground(new java.awt.Color(51, 0, 51));
        jButton5.setForeground(new java.awt.Color(153, 153, 0));
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(10, 40, 20, 20);

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setForeground(new java.awt.Color(153, 153, 0));
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(40, 40, 20, 20);

        jButton7.setBackground(new java.awt.Color(164, 167, 255));
        jButton7.setForeground(new java.awt.Color(153, 153, 0));
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(70, 70, 20, 20);

        jButton8.setBackground(new java.awt.Color(141, 141, 141));
        jButton8.setForeground(new java.awt.Color(153, 153, 0));
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(100, 40, 20, 20);

        jButton9.setBackground(new java.awt.Color(0, 0, 255));
        jButton9.setForeground(new java.awt.Color(153, 153, 0));
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(100, 70, 20, 20);

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setForeground(new java.awt.Color(153, 153, 0));
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton10MouseReleased(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(70, 10, 20, 20);

        jButton11.setBackground(new java.awt.Color(0, 102, 102));
        jButton11.setForeground(new java.awt.Color(153, 153, 0));
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton11MouseReleased(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(40, 70, 20, 20);

        jButton12.setBackground(java.awt.Color.white);
        jButton12.setForeground(new java.awt.Color(153, 153, 0));
        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton12MouseReleased(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(70, 40, 20, 20);

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setForeground(new java.awt.Color(153, 153, 0));
        jButton13.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 40, 40, 40, new java.awt.Color(102, 255, 255)));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton13MouseReleased(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(10, 70, 20, 20);

        jButton14.setText("OK");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(30, 100, 60, 25);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 40, 130, 130);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Distance"));
        jPanel3.setLayout(null);

        distance.setEnabled(false);
        jPanel3.add(distance);
        distance.setBounds(20, 30, 70, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 480, 110, 70);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        jLabel1.setText("Réalisé par : Yassine FAIQ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(810, 530, 160, 20);

        jMenu1.setText("Acceuil");
        jMenu1.add(jSeparator1);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Plus court chemin");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);
        jMenu1.add(jSeparator3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Nouveau arc");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem5.setText("Matrice des coefficients");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem7.setText("Matrice d'adjacence");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator4);

        jMenuItem4.setText("Échantillon");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Charger un arrière plan");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Nouveau projet");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Annuler");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Elimination");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Eliminer un noeud");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Eliminer un arc");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Eliminer tous les arcs");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Option");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem12.setText("Couleur");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1012, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       int xxx, yyy;   
       xxx=evt.getX();
       yyy=evt.getY();
       if(evt.isMetaDown()){
           cliqueSurNoeud(xxx, yyy );            
          if(nn==2){
              nn=0;
               Algorithme_Dijsktra Dijkstra = new Algorithme_Dijsktra(arbres,arret,permanante, noeudFin);
               Dijkstra.dijkstra();
               distance.setText(""+Dijkstra.getDistance());
               
           }
       }
       else{
       if(!reNoeud(xxx,yyy)){
          if(arret<50){
               arbres.setCordeX(arret,xxx);
               arbres.setCordeY(arret,yyy);
               arbres.setNombre(arret, arret);
             Pint.pintCircle(jPanel1.getGraphics(),arbres.getCordeX(arret), arbres.getCordeY(arret),String.valueOf(arbres.getNombre(arret)));
           arret++;          
          } 
         else JOptionPane.showMessageDialog(null,"Le nombre maximum de nœuds a été atteint.");
       } 
         if(n==2 ){
             n=0; 
             int  ta = creerTaille("Entrez la taille");
             if(GrandArc < ta) GrandArc=ta;
             arbres.setAdjacence(id2, id, 1);
             arbres.setAdjacence(id, id2, 1);
             arbres.setCoefficient(id2, id,ta );
             arbres.setCoefficient(id, id2, ta);
             Pint.pintLigne(jPanel1.getGraphics(),arbres.getCordeX(id), arbres.getCordeY(id), arbres.getCordeX(id2), arbres.getCordeY(id2), ta); 
             Pint.pintCircle(jPanel1.getGraphics(),arbres.getCordeX(id), arbres.getCordeY(id),String.valueOf(arbres.getNombre(id)));
             Pint.pintCircle(jPanel1.getGraphics(),arbres.getCordeX(id2), arbres.getCordeY(id2),String.valueOf(arbres.getNombre(id2)));
              id=-1;
              id2=-1;
         }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed

    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        jPanel1.paint(jPanel1.getGraphics()); 
         n=0;
         id=-1;
         id2=-1;
            int Matrice[][]={{0,1,0,1,1,0,0,1},
                            {1,0,1,0,0,0,0,0},
                            {0,1,0,1,1,0,0,0},
                            {1,0,1,0,0,0,0,0},
                            {1,0,1,0,0,1,0,0},
                            {0,0,0,0,1,0,1,1},
                            {0,0,0,0,0,1,0,0},
                            {1,0,0,0,0,1,0,0}
                           };
          int coe[][]={{0,50,0,46,216,0,0,578}, 
               {50,0,59,0,0,0,0,0}, 
               {0,59,0,89,174,0,0,0},
               {46,0,89,0,0,0,0,0},
               {216,0,174,0,0,471,0,0} ,
               {0,0,0,0,471,0,194,398},  
               {0,0,0,0,0,194,0,0}, 
               {578,0,0,0,0,398,0,0},
  
  };
   int xx1[]={202,102,8,198,248,352,481,416};
  int yy1[]={12,74,165,113,233,300,368,177};
  int nom[]={0,1,2,3,4,5,6,7};          
        GrandArc=600;       
        for (int j = 0; j < 8; j++) {
            arbres.setCordeX(j, xx1[j]);
            arbres.setCordeY(j, yy1[j]);
            arbres.setNombre(j, nom[j]);      
         
        }
        for (int j = 0; j < 8; j++) {            
            for (int k = 0; k < 8; k++) {
                arbres.setAdjacence(j,k, Matrice[j][k]);
                arbres.setCoefficient(j, k, coe[j][k]); 
            }
        }        
       arret=8;       
        R_repaint(arret,arbres);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(arret==0)
            JOptionPane.showMessageDialog(null,"Nœud n'a pas encore été créé : ");
        
        else{
            this.setEnabled(false);
          new Matrices(arret,arbres,2,this).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      if(arret==0)
            JOptionPane.showMessageDialog(null,"Nœud n'a pas encore été créé : ");
      
      else{
          this.setEnabled(false);
        new Matrices(arret,arbres,1,this).setVisible(true);
      }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       if(arret<=1)
            JOptionPane.showMessageDialog(null,"Entrez un nouveau noeud : ");
       
       else{
           this.setEnabled(false);
         new WindowsArc(arbres,pint,arret,this).setVisible(true);
           jPanel1.paint(jPanel1.getGraphics());
           R_repaint(arret,arbres);        
       }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        R_repaint(arret,arbres);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
     // TODO add your handling code here:
      
        
         
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
     
    }//GEN-LAST:event_jPanel1KeyReleased

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
         
          for (int j = 0; j < arret; j++) {
              arbres.setCordeX(j,0);
              arbres.setCordeY(j,0);              
              arbres.setNombre(j,0);            
        }
         for (int j = 0; j < arret; j++) {
             for (int k = 0; k < arret; k++) {
                 arbres.setAdjacence(j, k, 0);
                 arbres.setCoefficient(j, k, 0);                 
             }            
        }
        arret=00;   
        jPanel1.repaint(); 
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    if(arret>=2){
        this.setEnabled(false);
      new EliminerArc(pint,arbres,arret,this).setVisible(true);
      jPanel1.paint(jPanel1.getGraphics());
      R_repaint(arret,arbres); 
    }
    else  JOptionPane.showMessageDialog(null,"Y a de noeuds ");
    
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
      int Eliminer= EntrerNoeudOrigne("Enrez noeud a éliminer ","Noeud pas existé",arret); 
 if(Eliminer<=arret && Eliminer>=0 && arret>0){
        for (int j = 0; j < arret; j++) {
            for (int k = 0; k < arret; k++){
                if(j==Eliminer ||k==Eliminer){
                    arbres.setAdjacence(j, k, -1);                    
                }
            }
        }
        for (int l = 0; l < arret-1; l++) {
                    for (int m = 0; m < arret; m++) {
                      if(arbres.getAdjacence(l, m)==-1){
                           arbres.setAdjacence(l, m,arbres.getAdjacence(l+1, m)); 
                           arbres.setAdjacence(l+1, m,-1);
                           arbres.setCoefficient(l, m,arbres.getCoefficient(l+1, m));
                      }
                  }
                }
                for (int l = 0; l < arret; l++) {
                    for (int m = 0; m < arret-1; m++) {
                
                     if(arbres.getAdjacence(l, m)==-1){
                           arbres.setAdjacence(l, m,arbres.getAdjacence(l, m+1)); 
                           arbres.setAdjacence(l, m+1,-1);
                           arbres.setCoefficient(l, m,arbres.getCoefficient(l, m+1));
                          
                     }
                    }
                }
                
                arbres.setCordeX(Eliminer,-10);
                arbres.setCordeY(Eliminer,-10);
                arbres.setNombre(Eliminer, -10);
                for (int j = 0; j < arret; j++) {
                    for (int k = 0; k < arret-1; k++) {
                        if(arbres.getCordeX(k)==-10){
                            arbres.setCordeX(k, arbres.getCordeX(k+1));
                            arbres.setCordeX(k+1, -10);
                            arbres.setCordeY(k, arbres.getCordeY(k+1));
                             arbres.setCordeY(k+1, -10);
                            arbres.setNombre(k, arbres.getNombre(k+1));
                            arbres.setNombre(k+1,-10);
                        }
                    }
               }
                for (int j = 0; j < arret; j++)                      
                arbres.setNombre(j,j);// renombramos             
                
                // eliminamos los -1 y  los -10 
                for (int j = 0; j < arret+1; j++) {
                    for (int k = 0; k < arret+1; k++) {
                       if( arbres.getAdjacence(j, k)!=-1)
                          arbres.setAdjacence(j, k, arbres.getAdjacence(j, k));
                       else 
                          arbres.setAdjacence(j, k, 0);                       
                       if(arbres.getCoefficient(j, k) !=-10)
                           arbres.setCoefficient(j, k, arbres.getCoefficient(j, k));
                       else
                           arbres.setCoefficient(j, k, 0);                        
                    }         
                }
                arret--;
                jPanel1.paint(jPanel1.getGraphics());
                R_repaint(arret,arbres);
       }    
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       for (int j = 0; j < arret; j++) {
            for (int k = 0; k < arret; k++) {      
                    arbres.setAdjacence(j, k, 0);
                    arbres.setAdjacence(k, j, 0);
                    arbres.setCoefficient(j, k, 0);
                    arbres.setCoefficient(k, j, 0);
            }
        }
        jPanel1.paint(jPanel1.getGraphics());
        R_repaint(arret,arbres);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
       jPanel1.setBackground(jButton3.getBackground());
       
    
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jPanel2.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        jPanel2.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
      R_repaint(arret,arbres);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
       jPanel1.setBackground(jButton4.getBackground());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
       jPanel1.setBackground(jButton2.getBackground());
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
      R_repaint(arret,arbres);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
      R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
      jPanel1.setBackground(jButton10.getBackground());
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseReleased
    R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseReleased

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
     jPanel1.setBackground(jButton5.getBackground());
              // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
    R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
       jPanel1.setBackground(jButton7.getBackground());
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseReleased
     R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseReleased

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
jPanel1.setBackground(jButton8.getBackground());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseReleased
     R_repaint(arret,arbres);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseReleased

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
      jPanel1.setBackground(jButton6.getBackground());  // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
       R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
      jPanel1.setBackground(jButton13.getBackground());  // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MousePressed

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
      jPanel1.setBackground(jButton11.getBackground());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseReleased
       R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseReleased

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
      jPanel1.setBackground(jButton9.getBackground());     // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
       jPanel1.setBackground(jButton12.getBackground()); // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseReleased
       R_repaint(arret,arbres);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseReleased

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
     R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseReleased

    private void jButton13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseReleased
       R_repaint(arret,arbres);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13MouseReleased

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
     if(arret>=2){
          permanante =  EntrerNoeudOrigne("Entrez le premier noeud","Y a pas de noeud",arret);// hacemos el llamano de la funcion         
          noeudFin =  EntrerNoeudOrigne("Entrez le dernier noeud","Y a pas de noeud",arret);
            Algorithme_Dijsktra Dijkstra = new Algorithme_Dijsktra(arbres,arret,permanante,noeudFin);
            Dijkstra.dijkstra();
            distance.setText(""+Dijkstra.getDistance());
        }
    else JOptionPane.showMessageDialog(null,"il faut créer plus de noeuds ");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       jDialog1.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
 
        JFileChooser select = (JFileChooser) evt.getSource();
        String commande = evt.getActionCommand();
        if(commande.equals(JFileChooser.APPROVE_SELECTION)){
            File selectioné = select.getSelectedFile();
            Image(selectioné);
            jDialog1.setVisible(false);
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        
    }
    private int arret=0;// lleva el # de nodos creado 
    private int noeudFin;
    private int permanante;
    int n=0,nn=0,id,id2;// permite controlar que se halla dado click sobre un nodo
    private int GrandArc;
 
   
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField distance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel jmapa;
    // End of variables declaration//GEN-END:variables
}
