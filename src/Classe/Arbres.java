/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classe;

/**
 *
 * @author fredy_000
 */
public class Arbres{
   private int Coefficient[][] = new int [51][51];
   private int Adjacence [][] = new int [51][51];
   private int cordeX [] = new int [51];
   private int cordeY [] = new int [51];
   private int nombre [] = new int [51];
   private int enArbre [];
   
   
   
   public Arbres(){
        
    }

    public int getCoefficient(int i, int j ) {
        return Coefficient[i][j];
    }

    public int getAdjacence(int i,int j) {
        return Adjacence[i][j];
    }

    public int getCordeX(int i) {
        return cordeX[i];
    }

    public int getCordeY(int i) {
        return cordeY[i];
    }

    public int getNombre(int i) {
        return nombre[i];
    }

    public int getEnArbre(int i) {
        return enArbre[i];
    }

    public void setCoefficient(int i,int j ,int Coefficient) {
        this.Coefficient[i][j] = Coefficient;
    }

    public void setAdjacence(int i,int j ,int Adjacence) {
        this.Adjacence[i][j] = Adjacence;
    }

    public void setCordeX(int i,int cordeX) {
        this.cordeX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.cordeY[i] = cordeY;
    }

    public void setNombre(int i,int nombre) {
        this.nombre[i] = nombre;
    }

    public void setEnArbre(int i,int enArbre) {
        this.enArbre[i] = enArbre;
    }
    public void creerEnArbre(int i){
       enArbre = new int [i]; 
    }  
    
}
