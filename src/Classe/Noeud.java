/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classe;

/**
 *
 * @author fredy-18
 */
public class Noeud {    
   private  int nombre ;
   private boolean visité ;
   private boolean etiquette;
   private int distance; 
   private Noeud Prédécesseur;
   
   public Noeud(){
       this.nombre =-1;
       this.visité = false;
       this.etiquette = false;
       this.Prédécesseur  = null;
       this.distance =0;       

   }

     public int getNombre() {
        return nombre;
    }

    public boolean estVisité() {
        return visité;
    }

    public boolean estEtiquette() {
        return etiquette;
    }

    public int getDistance() {
        return distance;
    }

    public Noeud getPrédécesseur() {
        return Prédécesseur;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void SetVisité(boolean visité) {
        this.visité = visité;
    }

    public void setEtiquette(boolean etiquette) {
        this.etiquette = etiquette;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setPrédécesseur(Noeud Prédécesseur) {
        this.Prédécesseur = Prédécesseur;
    }

    
}
