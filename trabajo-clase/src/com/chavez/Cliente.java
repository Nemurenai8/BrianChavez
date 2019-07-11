package com.chavez;

import com.chavez.excepciones.ErrorValidacion;

public class Cliente {

    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Cliente(String id, String nombre, String apellido){

    }

    public void setId(String id) throws ErrorValidacion {
        if(id.length() != 13){
            throw new ErrorValidacion("El numero de identidad debe contener 13 caracteres");
        }
        this.id = id;
    }

    public String getId(String id) {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }

    public void setTelefono(String telefono) throws ErrorValidacion {
        if (!telefono.matches("^(\\+?504\\s?)?[0-9]{4}\\-?[0-9]{4}")) {
            throw new ErrorValidacion("El numero de telefono es invalido");
        }
        this.telefono = telefono;
    }

    public String getTelefonol() {
        return telefono;
    }

    public void setEmail(String email) throws ErrorValidacion {
        if (!email.matches("^([a-z0-9_\\-\\.]+)@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$"))
        {
            throw new ErrorValidacion("Correo Electronico Invalido");
        }
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
