/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caballero.springmvcmaven.controllers;

import com.caballero.springmvcmaven.models.ConnectionMysql;
import java.sql.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jcaballero
 */
@Controller
public class LoginController {
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(Model model, @RequestParam("user") String user, @RequestParam("password") String password) throws SQLException, ClassNotFoundException{
        
        model.addAttribute("user", user);
        model.addAttribute("password", password);

        Connection cn = ConnectionMysql.obtener();
        Statement st;
        ResultSet rs;
        
        st = cn.createStatement();
        rs = st.executeQuery("select * from user where user = '"+user+"';");
        
        model.addAttribute("id",rs.getInt(2));
        
        
        return "index";
    }
    
    
}
