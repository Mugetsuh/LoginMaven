/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.dto.Usuario;
import com.mycompany.interfaces.ILogin;
import com.mycompany.utilities.Users;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author shhin
 */
@Stateless
public class Login implements ILogin {

    @EJB
    private Users users;

    @Override
    public Usuario login(String usuario, String clave) {
        for (Usuario user : users.getUsuarios()) {
            if (user.getUsername().equals(usuario) && user.getPassword().equals(clave)) {
                return user;
            }
        }
        return null;
    }

}
