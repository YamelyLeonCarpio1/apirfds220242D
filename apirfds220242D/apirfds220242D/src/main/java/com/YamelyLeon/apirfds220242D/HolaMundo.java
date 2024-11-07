package com.YamelyLeon.apirfds220242D;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

public class HolaMundo {



@RestController
@RequestMapping("/Saludar")
public class HolaMundoController {
    @GetMapping("/hola")
    public String hola() {
        return "¡Hola, Mundo!";

    }
    
}
}
