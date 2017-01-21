package com.example;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dougmolina on 12/17/16.
 */
@RestController
public class HomeController {

    //@RequestMapping("/")
    public String home(){
        return "PARE DE SUFRIR!";
    }



}
