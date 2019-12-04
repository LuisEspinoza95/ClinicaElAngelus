
package dto;


public class PagoExamen {
     private Integer id_pagoexamen;
    private Integer id_examen;
    private String fec_pago;
    private Double total;
    private String estado;

    public PagoExamen() {
    }

    public PagoExamen(Integer id_examen, Double total) {
        this.id_examen = id_examen;
        this.total = total;
    }
    
    

    public PagoExamen(Integer id_pagoexamen, Integer id_examen, String fec_pago, Double total, String estado) {
        this.id_pagoexamen = id_pagoexamen;
        this.id_examen = id_examen;
        this.fec_pago = fec_pago;
        this.total = total;
        this.estado = estado;
    }

    public Integer getId_pagoexamen() {
        return id_pagoexamen;
    }

    public void setId_pagoexamen(Integer id_pagoexamen) {
        this.id_pagoexamen = id_pagoexamen;
    }

    public Integer getId_examen() {
        return id_examen;
    }

    public void setId_examen(Integer id_examen) {
        this.id_examen = id_examen;
    }

  

    public String getFec_pago() {
        return fec_pago;
    }

    public void setFec_pago(String fec_pago) {
        this.fec_pago = fec_pago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
