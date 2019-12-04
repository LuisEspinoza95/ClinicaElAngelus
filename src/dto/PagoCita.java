
package dto;


public class PagoCita {
     private Integer id_pagocita;
    private Integer id_cita;
    private String fec_pago;
    private Double total;
    private String estado;

    public PagoCita() {
    }

    public PagoCita(Integer id_cita, Double total) {
        this.id_cita = id_cita;
        this.total = total;
    }
    
    

    public PagoCita(Integer id_pagocita, Integer id_cita, String fec_pago, Double total, String estado) {
        this.id_pagocita = id_pagocita;
        this.id_cita = id_cita;
        this.fec_pago = fec_pago;
        this.total = total;
        this.estado = estado;
    }

    public Integer getId_pagocita() {
        return id_pagocita;
    }

    public void setId_pagocita(Integer id_pagocita) {
        this.id_pagocita = id_pagocita;
    }

    public Integer getId_cita() {
        return id_cita;
    }

    public void setId_cita(Integer id_cita) {
        this.id_cita = id_cita;
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
