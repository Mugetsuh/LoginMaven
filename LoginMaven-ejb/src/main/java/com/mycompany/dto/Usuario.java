/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.util.ArrayList;

/**
 *
 * @author shhin
 */
public class Usuario {

    private String Name;
    private String Username;
    private String Password;
    private ArrayList<String> permiso;

    public Usuario() {
    }

    public Usuario(String Name, String Username, String Password, ArrayList<String> permisos) {
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
        this.permiso = permiso;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ArrayList<String> getPermiso() {
        return permiso;
    }

    public void setPermiso(ArrayList<String> permiso) {
        this.permiso = permiso;
    }

}
