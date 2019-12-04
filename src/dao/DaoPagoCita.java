
package dao;

import dto.PagoCita;
import java.util.List;


public interface DaoPagoCita {
    public String pagoCitaINS(PagoCita pagoCita);
    public List<Object[]> pagoCitaSEL(String codigo);
     public String getMessage();
}
