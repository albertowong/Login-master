package com.example.wongswich.login.Vista;

/**
 * Created by albertowong on 03/03/16.
 */
public class Credenciales {
    private String servidor;

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getEstatusUsr() {
        return estatusUsr;
    }

    public void setEstatusUsr(String estatusUsr) {
        this.estatusUsr = estatusUsr;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    private String estatusUsr;
    private int nivel;
    private int idUsuario;
    private int idEmpresa;

}
