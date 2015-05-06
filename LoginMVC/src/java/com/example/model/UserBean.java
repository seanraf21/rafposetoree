/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.model;

/**
 *
 * @author Sean
 */
public class UserBean {
    String user = "sean";
    String pass = "sean";
    
    public boolean isUserValid(String user, String pass){
        if(this.user.equals(user) && this.pass.equals(pass))
            return true;
        return false;
    }
}
