/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class PersistirObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GeneradorCalificaciones g = new GeneradorCalificaciones();
        for(Evaluacion e: g.generarCalificaciones()){
            SessionFactory factory = HibernateUtilidades.getSessionFactory();
            Session sesion = factory.openSession();
            Transaction tranza =sesion.beginTransaction();
            
            sesion.save(e);
            System.out.println("Registro Guardado");
            tranza.commit();
            sesion.close();
        }
    }
    
}
