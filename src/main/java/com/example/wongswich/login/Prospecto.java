package com.example.wongswich.login;

/**
 * Created by wongswich on 03/02/16.
 */
public class Prospecto {
    private String nombre;
    private String apellidos;
    private String correo;
    private String titulo;
    private String sexo;
    private String empresa;
    private int    numeroEmpleados;
    private String puesto;
    private String fechaContacto;
    private String tkFase;
    private String tokenUsuario;
    private String fechaUltimoSeguimiento;
    private String etiquetas;
    private String ultimaModificacion;
    private String tokenRazonPerdida;
    private String facebook;
    private String googlePlus;
    private String linkedIn;
    private String skype;
    private String tokenProspecto; //convertirla en constante o final (depende);
    private int imagen;
    public Prospecto(){}

    public Prospecto(int imagen, String nombre, String correo){
        this.imagen=imagen;
        this.nombre=nombre;
        this.correo=correo;
    }
    public Prospecto(String nombre, String apellidos, String correo, String tokenProspecto,
                     String titulo, String etiquetas, String ultimaModificacion){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.correo=correo;
        this.titulo=titulo;
        this.sexo=null;
        this.empresa=null;
        this.numeroEmpleados=0;
        this.puesto=null;
        this.fechaContacto=null;
        this.tkFase=null;
        this.tokenUsuario=null;
        this.fechaUltimoSeguimiento=null;
        this.facebook=null;
        this.googlePlus=null;
        this.linkedIn=null;
        this.skype=null;
        this.tokenProspecto=tokenProspecto;
        this.etiquetas=etiquetas;
        this.ultimaModificacion=ultimaModificacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaContacto() {
        return fechaContacto;
    }

    public void setFechaContacto(String fechaContacto) {
        this.fechaContacto = fechaContacto;
    }

    public String getTkFase() {
        return tkFase;
    }

    public void setTkFase(String tkFase) {
        this.tkFase = tkFase;
    }

    public String getTokenUsuario() {
        return tokenUsuario;
    }

    public void setTokenUsuario(String tokenUsuario) {
        this.tokenUsuario = tokenUsuario;
    }

    public String getFechaUltimoSeguimiento() {
        return fechaUltimoSeguimiento;
    }

    public void setFechaUltimoSeguimiento(String fechaUltimoSeguimiento) {
        this.fechaUltimoSeguimiento = fechaUltimoSeguimiento;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getTokenRazonPerdida() {
        return tokenRazonPerdida;
    }

    public void setTokenRazonPerdida(String tokenRazonPerdida) {
        this.tokenRazonPerdida = tokenRazonPerdida;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGooglePlus() {
        return googlePlus;
    }

    public void setGooglePlus(String googlePlus) {
        this.googlePlus = googlePlus;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getTokenProspecto() {
        return tokenProspecto;
    }

    public void setTokenProspecto(String tokenProspecto) {
        this.tokenProspecto = tokenProspecto;
    }

    public int getImagen(){return imagen;}
}
