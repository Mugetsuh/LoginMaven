/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.dto.Usuario;

/**
 *
 * @author shhin
 */
public interface ILogin {

    public Usuario login(String usuario, String clave);
}
