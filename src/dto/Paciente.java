
package dto;

public class Paciente {
    private String cod_paciente;
    private String contrasena;
    private String nom_paciente;
    private String ape_paterno;
    private String ape_materno;
    private String fec_nacimiento;
    private Integer edad;
    private String genero;
    private String direccion;
    private String telefono;
    private String correo;

    public Paciente() {
    }

    public Paciente(String cod_paciente, String contrasena, String nom_paciente, String ape_paterno, String ape_materno, String fec_nacimiento, Integer edad, String genero, String direccion, String telefono, String correo) {
        this.cod_paciente = cod_paciente;
        this.contrasena = contrasena;
        this.nom_paciente = nom_paciente;
        this.ape_paterno = ape_paterno;
        this.ape_materno = ape_materno;
        this.fec_nacimiento = fec_nacimiento;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCod_paciente() {
        return cod_paciente;
    }

    public void setCod_paciente(String cod_paciente) {
        this.cod_paciente = cod_paciente;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNom_paciente() {
        return nom_paciente;
    }

    public void setNom_paciente(String nom_paciente) {
        this.nom_paciente = nom_paciente;
    }

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) {
        this.ape_materno = ape_materno;
    }

    public String getFec_nacimiento() {
        return fec_nacimiento;
    }

    public void setFec_nacimiento(String fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
