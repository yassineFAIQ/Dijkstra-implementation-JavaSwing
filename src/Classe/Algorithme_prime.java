/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classe;

import static Windows.WindowsPrincipal.R_repaint;
import static Windows.WindowsPrincipal.EntrerNoeudOrigne;
import static Windows.WindowsPrincipal.jPanel1;
import java.awt.Color;

/**
 *
 * @author fredy-18
 */
public class Algorithme_prime {

    private int distance;
   private int PetitNoeud;
   private int  fin;
   private boolean CeNoeud=false;
   private boolean AugmenterTaille;
   private int cibleNoeud;  
   private int cibleNoeudr;
   private int taille;
   private int GrandNoeud;
   private  Arbres arbres;
   private int arret;
   private  int  NoeudOrigine;
   
   
   
   public Algorithme_prime(Arbres arbre , int top ,int aristaMayor ){
       this.distance = 0;
       this.PetitNoeud = 0;
       this.fin = 0;
       this.CeNoeud=false;
       this.AugmenterTaille = false;
       this.cibleNoeud = 0;  
       this.cibleNoeudr = 0;
       this.taille = 1;
       this. GrandNoeud=aristaMayor;
       this.arbres = arbre;
       this.arret = arret;
   }

    public int getCumulado() {
        return distance;
    }
  
   
  public void prime(){
      this.NoeudOrigine= EntrerNoeudOrigne("Entrez noeud Origin","Noeud origin n'existe pas",arret);
       jPanel1.paint(jPanel1.getGraphics());
       R_repaint(arret,arbres);
       arbres.creerEnArbre(arret);
       arbres.setEnArbre(0, NoeudOrigine);
       //algorithme  Prim ---->>
       do{
           this.PetitNoeud = this.GrandNoeud;
           this.fin=2;
            for (int j = 0; j < taille; j++) {
                for (int k = 0; k < arret; k++){
                    if(arbres.getAdjacence(k, arbres.getEnArbre(j))==1){
                        for (int h = 0; h < taille; h++) {
                             if(arbres.getEnArbre(h)==k ){
                                 this.CeNoeud=true; 
                                 break;
                             }
                        }
                        if(CeNoeud==false){
                            if(arbres.getCoefficient(k, arbres.getEnArbre(j))<=PetitNoeud && arbres.getCoefficient(k, arbres.getEnArbre(j))>0 ){
                                 PetitNoeud=arbres.getCoefficient(k, arbres.getEnArbre(j));
                                 this.cibleNoeud=k;
                                 this.AugmenterTaille=true;
                                 this.cibleNoeudr=arbres.getEnArbre(j);
                                 this.fin=1;
                            }
                        }
                        this.CeNoeud=false;
                    }
                }
            }//fin  for (int j = 0; j < taille; j++)              
         if(AugmenterTaille==true){
                    Pint.pintRoute(jPanel1.getGraphics(),arbres.getCordeX(cibleNoeudr), arbres.getCordeY(cibleNoeudr),arbres.getCordeX(cibleNoeud), arbres.getCordeY(cibleNoeud),Color.red); 
                    Pint.cliqueSurNoeud(jPanel1.getGraphics(),arbres.getCordeX(cibleNoeudr), arbres.getCordeY(cibleNoeudr), null,Color. red);
                    Pint.cliqueSurNoeud(jPanel1.getGraphics(),arbres.getCordeX(cibleNoeud), arbres.getCordeY(cibleNoeud), null, Color.red);                                  
                    arbres.setEnArbre(taille, cibleNoeud);
                    this.taille++;
                    this.AugmenterTaille=false;
                    this.distance += this.PetitNoeud;
         }
        }while(fin<2);
   }
    
}
