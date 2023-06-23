/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;
/**
 *
 * @author Brayan Rodriguez
 */
public class Datos {
    Nombres nombres;
    String fecha;
    String correo;
    String rfc;
    String sexo;
    Direccion direccion;

    public Datos(Nombres nombres,String fecha, String correo,String rfc, String sexo, Direccion direccion) {
        this.nombres=nombres;
        this.fecha = fecha;
        this.correo = correo;
        this.rfc = rfc;
        this.sexo = sexo;
        this.direccion =direccion;
    }

    public Datos() {
    }

    public Nombres getNombres() {
        return nombres;
    }

    public void setNombres(Nombres nombres) {
        this.nombres = nombres;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    
    
}