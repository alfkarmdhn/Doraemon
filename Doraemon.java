package doraemon;
import java.util.ArrayList;
public class Doraemon {
    public static void main(String[] args) {
      ArrayList kantongAjaib = new ArrayList(); 
      
      kantongAjaib.add("Pintu ke masa depan");
      kantongAjaib.add(532);
      kantongAjaib.add("mantan");
      kantongAjaib.add(1231234.132);
      kantongAjaib.add(true);
      kantongAjaib.remove("mantan");
      kantongAjaib.add("calon");
      kantongAjaib.set(4,"penguin");
      kantongAjaib.add(4,"Alkaa");
      
      System.out.println(kantongAjaib);
      System.out.println(kantongAjaib.size());
      System.out.println(kantongAjaib.get(5));
      
    }
    
}
