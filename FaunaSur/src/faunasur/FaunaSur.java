
package faunasur;
import java.util.List;


public class FaunaSur {

  
   
    public static void main(String[] args) {
        CentroRescate centro = new CentroRescate("FaunaSur");
        
        try {
            centro.agregarAnimal(new Ave("AV-10", "Luina", EstadoSalud.ESTABLE, 80));
            centro.agregarAnimal(new Mamifero("MA-20", "Puma", EstadoSalud.EN_RECUPERACION, 12));
        }
    }
    
}
