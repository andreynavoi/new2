package Modeli;

import java.io.InputStream;

public class Model {
    
   private String marka;
   private String cvet;
   private String rezina;
   private int massa;
   private String salon;  // cvet. material.

    public Model() {
    }
   
   

    public Model(String marka, String cvet, String rezina, int massa, String salon) {
        this.marka = marka;
        this.cvet = cvet;
        this.rezina = rezina;
        this.massa = massa;
        this.salon = salon;
    }

    public Model(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
//<editor-fold defaultstate="collapsed" desc="metod">
    
    public void scorost(){
        print("Scorost Model 1 "+getMarka());
    }
    public void peredacha(){
        print("peredacha 1");  // avtomatizirovat na formulu
    }
    public void vpered(){
        print(getMarka()+" Edet vpered 1");
    }
    public void nazad(){
        print(getMarka()+"Edet nazad 1");
    }
    public void vlevo(){
        print(getMarka()+"Edet vlevo 1");
    }
    public void vpravo(){
        print(getMarka()+"Edet vpravo1");
    }
//</editor-fold>
   public static void print(String str){
       System.out.println(str);
   }

   //<editor-fold defaultstate="collapsed" desc="get set">
   
   public String getMarka() {
       return marka;
   }
   
   
   public void setMarka(String marka) {
       this.marka = marka;
   }
   
   
   public String getCvet() {
       return cvet;
   }
   
   
   public void setCvet(String cvet) {
       this.cvet = cvet;
   }
   
   
   public String getRezina() {
       return rezina;
   }
   
   
   public void setRezina(String rezina) {
       this.rezina = rezina;
   }
   
   
   public int getMassa() {
       return massa;
   }
   
   
   public void setMassa(int massa) {
       this.massa = massa;
   }
   
   
   public String getSalon() {
       return salon;
   }
   
   public void setSalon(String salon) {
       this.salon = salon;
   }
//</editor-fold>
   
   
}
