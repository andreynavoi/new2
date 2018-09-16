package markiavto;

import Modeli.Ferrari;
import Modeli.Lamborgini;
import Modeli.Model;
import java.util.Scanner;
//import java.util.*;
public class MarkiAvto {


  
    public static void main(String[] args) {
       
     String n;
     String m;
     Model model = new Model();
     System.out.println("Ввести название авто: ");
     Scanner scn=new Scanner(System.in);
     //n = scn.nextInt();
     n = scn.nextLine();
     System.out.println("Ввести цвет авто; " +n);
     m = scn.nextLine();
     
    
     model.getCvet();
     model.getMarka();
     model.scorost();
     model.peredacha();
     model.vpered();
     
             
             
     
     Lamborgini lambda = new Lamborgini();
   //lambda.setMarka(marka);
   System.out.println("Ввести название авто: ");
     
     //n = scn.nextInt();
     n = scn.nextLine();
     System.out.println("Ввести цвет авто; ");
     m = scn.nextLine();
     lambda.getLamborgini();
     lambda.scorost();
     lambda.peredacha();
     lambda.vpered();
     
     Ferrari ferra = new Ferrari();
     ferra.getCvet();
    }
    
}
//как полноценная база данных. Вызвал марку вышли ее параметры. 
//если как то можно изменять параметры. И еще поплнять список перечня 
// и объектов и интерфейса т.е. то что привязано к объектам, нуменклатура.