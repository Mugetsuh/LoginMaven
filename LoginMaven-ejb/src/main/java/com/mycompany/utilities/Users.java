/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utilities;

import com.mycompany.dto.Permisos;
import com.mycompany.dto.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 *
 * @author shhin
 */
@Named
@Singleton
public class Users implements Serializable {

    ArrayList<Usuario> usuarios;
    ArrayList<String> permisos;

    public Users() {
        permisos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    @PostConstruct
    public void CargarUsuarios() {
        permisos.add("Administrador");        
        usuarios.add(new Usuario("German", "German12", "1234", permisos)); 
        permisos.clear();
        permisos.add("Usuario");
        usuarios.add(new Usuario("Carlos", "cARLO12", "1234", permisos)); 
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
