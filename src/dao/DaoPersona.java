
package dao;

import dto.Persona;
import java.util.List;


public interface DaoPersona {
     public Persona login(String codigo, String dni);
    public List<Object[]> personaSEL();
    public List<Object[]> citasaprobadasSEL(String codigo);
    public String getMessage();
}
