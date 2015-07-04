package holis;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class GeneradorCalificaciones {

    public GeneradorCalificaciones() {
    }
    
  public ArrayList<Evaluacion> generarCalificaciones(){
      ArrayList<Evaluacion> calificaciones = new ArrayList<Evaluacion>();
      Evaluacion e1 = new Evaluacion();
      e1.setNombre("Petra");
      e1.setCalificacion(5.8f);
      Evaluacion e2 = new Evaluacion();
      e2.setNombre("Jose");
      e2.setCalificacion(7.4f);
      Evaluacion e3 = new Evaluacion();
      e3.setNombre("Roberta");
      e3.setCalificacion(8.6f);
      
      calificaciones.add(e1);
      calificaciones.add(e2);
      calificaciones.add(e3);
      
      return calificaciones;
      
  }
    
    
}
