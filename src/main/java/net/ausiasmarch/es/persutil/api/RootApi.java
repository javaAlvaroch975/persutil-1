package net.ausiasmarch.es.persutil.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootApi {

    @GetMapping
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Funciona, bienvenido a persutil<br>" +
                "Endpoints disponibles:<br>" +
                "- /blog/saludar<br>" +
                "- /blog/aleatorio<br>" +
                "- /blog/rellenauno<br>" +
                "- /blog/frasealeatoria<br>" +
                "- /status<br>", HttpStatus.OK);
    }
    
    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("API funcionando correctamente ✅", HttpStatus.OK);
    }
}