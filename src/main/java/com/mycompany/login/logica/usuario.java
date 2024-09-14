package com.mycompany.login.logica;

/**
 *
 * @author Francisco
 */
public class usuario {
   
   private int id; 
   private String nombreUsuario;
   private String Contrasena;

    public usuario() {
    }

    public usuario(int id, String nombreUsuario, String Contrasena) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.Contrasena = Contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
   
   
}
