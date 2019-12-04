
package dao;

import dto.PagoExamen;
import java.util.List;


public interface DaoPagoExamen {
    public String pagoExamenINS(PagoExamen pagoExamen);
    public List<Object[]> pagoExamenSEL(String codigo);
     public String getMessage();
    
}
