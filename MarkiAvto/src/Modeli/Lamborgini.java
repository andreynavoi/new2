package Modeli;

public class Lamborgini extends Model{  //nasledovanie i pereopredelenie
    
   

    public Lamborgini() {
    }
   
   private String Lamborgini;

    public Lamborgini(String Lamborgini) {
       
        this.Lamborgini = Lamborgini;
    }
   
    
    @Override
 public void scorost(){
        print("Scorost Model 2 ");
    }
    @Override
    public void peredacha(){
        print(getLamborgini()+"peredacha 2");  // avtomatizirovat na formulu
    }
    @Override
    public void vpered(){
        print(getLamborgini()+" Edet vpered 2");
    }
    @Override
    public void nazad(){
        print(getLamborgini()+"Edet nazad");
    }

    @Override
    public void vlevo(){
        print(getLamborgini()+"Edet vlevo");
    }
    @Override
    public void vpravo(){
        print(getLamborgini()+"Edet vpravo");
    }    

    
    public String getLamborgini() {
        return Lamborgini;
    }

    
    public void setLamborgini(String Lamborgini) {
        this.Lamborgini = Lamborgini;
    }
    
}
