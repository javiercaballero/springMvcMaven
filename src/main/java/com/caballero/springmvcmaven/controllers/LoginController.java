/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caballero.springmvcmaven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jcaballero
 */
@Controller
public class LoginController {
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(){
        
        return "index";
    }
    
    
}
