package com.YamelyLeon.apirfds220242D;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saludito")
public class HolaMundoController {
    @GetMapping("/hola")
    public String hola() {
        return "¡Hola, Mundo!";
    }
    
}
