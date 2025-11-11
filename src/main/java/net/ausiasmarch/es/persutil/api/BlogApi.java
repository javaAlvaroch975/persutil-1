package net.ausiasmarch.es.persutil.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ausiasmarch.es.persutil.entity.BlogEntity;
import net.ausiasmarch.es.persutil.service.AleatorioService;
import net.ausiasmarch.es.persutil.service.BlogService;

@RestController
@RequestMapping("/blog")
public class BlogApi {

    @Autowired
    AleatorioService aleatorioService;

    @Autowired
    BlogService oBlogService;

    @Autowired
    BlogEntity oBlogEntity;

    @GetMapping("/saludar")
    public ResponseEntity<String> saludar() {
        return new ResponseEntity<>("Hola desde la API de Blog", HttpStatus.OK);

    }

    @GetMapping("/saludar/{nombre}")
    public ResponseEntity<String> saludarNombre(@PathVariable String nombre) {
        return new ResponseEntity<>("Hola " + nombre + " desde la API de Blog", HttpStatus.OK);
    }

    @GetMapping("/saludar/buenosdias")
    public ResponseEntity<String> saludarBuenosDias() {
        return new ResponseEntity<>("Buenos dias desde la API de Blog", HttpStatus.OK);
    }

    @GetMapping("/aleatorio")
    public ResponseEntity<Integer> aleatorio() {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        return new ResponseEntity<>(numeroAleatorio, HttpStatus.OK);
    }

    @GetMapping("/aleatorio/service/{min}/{max}")
    public ResponseEntity<Integer> aleatorioEnRango(@PathVariable int min, @PathVariable int max) {
        int numeroAleatorio = aleatorioService.generarNumeroAleatorio(min, max);
        return new ResponseEntity<>(numeroAleatorio, HttpStatus.OK);
    }

    @GetMapping("/rellenauno")
    public ResponseEntity<Long> rellenaUno() {
        return ResponseEntity.ok(oBlogService.rellenaBlog());
    }

    @GetMapping("/frasealeatoria")
    public ResponseEntity<String[]> fraseAleatoria(){
        String[] frase = aleatorioService.generarFraseAleatoria();
        oBlogEntity.setTitulo(frase[0] + " " + frase[1] + " " + frase[2] + " " + frase[3] + " " + frase[4]);
        frase = aleatorioService.generarFraseAleatoria();
        oBlogEntity.setContenido(frase[0] + " " + frase[1] + " " + frase[2] + " " + frase[3] + " " + frase[4]);
        frase = aleatorioService.generarFraseAleatoria();
        oBlogEntity.setEtiquetas(frase[0] + " " + frase[1] + " " + frase[2] + " " + frase[3] + " " + frase[4]);
        return new ResponseEntity<>(frase, HttpStatus.OK);
    
    }

}
