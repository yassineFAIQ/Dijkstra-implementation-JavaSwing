/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classe;


import static Windows.WindowsPrincipal.jPanel1;
import static Windows.WindowsPrincipal.R_repaint;
import static Windows.WindowsPrincipal.EntrerNoeudOrigne;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy-18
 */
public class Algorithme_Dijsktra  {
   private Arbres arbres;
   private int subArret;
   private Noeud auxi=null;
   private int auxDistance; 
   private int subDistance;
   private Noeud noeud[]; 
   private int arret;
   private int permanante;     
   private int noeudFin; 
   
   
    public Algorithme_Dijsktra  (Arbres arbres, int arret,int permanante, int noeudFin){
        this.arbres = arbres;        
        this.arret = arret;
        this.noeud= new Noeud[arret]; 
        this.permanante = permanante;
        this.noeudFin = noeudFin;
        
    }

    public int getDistance(){
        return noeud[noeudFin].getDistance(); 
    }
        
    public void dijkstra(){ 
         for (int i = 0; i < arret; i++)  // on crée le noeud vectoriel de la taille d'arret qui a le nombre de noeud peint 
                    noeud[i]= new Noeud(); 
         
        if(permanante != noeudFin){
             jPanel1.paint(jPanel1.getGraphics());
             R_repaint(arret, arbres);   
             Pint.cliqueSurNoeud(jPanel1.getGraphics(), arbres.getCordeX(permanante), arbres.getCordeY(permanante), null,Color.GREEN); 
            
        
            noeud[permanante].SetVisité(true);        
            noeud[permanante].setNombre(permanante);       
            
            do{            
              subDistance=0;
              auxDistance = 2000000000; // nous l'assimilons à ce chiffre puisque la distance des noeuds, soi-disant ne sera jamais plus grande 
              noeud[permanante].setEtiquette(true); 
              for (int j = 0; j < arret; j++) {
                  if(arbres.getAdjacence(j, permanante)==1){
                        subDistance= noeud[permanante].getDistance()+arbres.getCoefficient(j, permanante);                                 
                        if(subDistance <= noeud[j].getDistance() && noeud[j].estVisité()==true && noeud[j].estEtiquette()== false){
                            noeud[j].setDistance(subDistance);
                            noeud[j].SetVisité(true);
                            noeud[j].setNombre(j);
                            noeud[j].setPrédécesseur(noeud[permanante]);
                        }
                        else if( noeud[j].estVisité()==false){
                            noeud[j].setDistance(subDistance);
                            noeud[j].SetVisité(true);
                            noeud[j].setNombre(j);
                            noeud[j].setPrédécesseur(noeud[permanante]); 
                       }
                 }
              }
              for (int i = 0; i <arret; i++) { // nous cherchons lequel des noeuds visités a la plus petite distance pour le choisir comme permanent
                if(noeud[i].estVisité()== true && noeud[i].estEtiquette()== false){
                   if(noeud[i].getDistance()<=auxDistance){
                       permanante= noeud[i].getNombre();
                       auxDistance= noeud[i].getDistance();
                   }
                }               
             }
            subArret++;                
          }while(subArret<arret+1);          
          auxi= noeud[noeudFin]; 
           if(auxi.getPrédécesseur() == null )
             JOptionPane.showMessageDialog(null,"Impossible d'atteindre le noeud "+noeudFin);          
          while(auxi.getPrédécesseur() != null){           
              Pint.pintRoute(jPanel1.getGraphics(), arbres.getCordeX(auxi.getNombre()), arbres.getCordeY(auxi.getNombre()), arbres.getCordeX(auxi.getPrédécesseur().getNombre()), arbres.getCordeY(auxi.getPrédécesseur().getNombre()),Color.GREEN);
              Pint.cliqueSurNoeud(jPanel1.getGraphics(), arbres.getCordeX(auxi.getNombre()), arbres.getCordeY(auxi.getNombre()), null,Color.GREEN);
             auxi=auxi.getPrédécesseur();              
          }  
         Pint.cliqueSurNoeud(jPanel1.getGraphics(), arbres.getCordeX(noeudFin), arbres.getCordeY(noeudFin), null,Color.GREEN);     
       }
       else Pint.cliqueSurNoeud(jPanel1.getGraphics(), arbres.getCordeX(noeudFin), arbres.getCordeY(noeudFin), null,Color.GREEN);    
    }
}
