/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicodigital.proyectounicodigital.beans;

import com.unicodigital.proyectounicodigital.controllers.UsuarioController;
import com.unicodigital.proyectounicodigital.entities.Usuario;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable{

    private Usuario usuario;
    private UsuarioController usuarioController;
    private String mensaje;

    public UsuarioBean() {
        usuario = new Usuario();
        usuarioController = new UsuarioController();      
    }
    

    public void crear() {
        usuario.setFecha(new Date());
        if (usuarioController.crear(usuario)) {
            mensaje = "Se creo el usuario correctamente.";
        }else{
            mensaje = "error al crear el usuario.";
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
