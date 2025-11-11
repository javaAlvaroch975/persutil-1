package net.ausiasmarch.es.persutil.service;

import org.springframework.stereotype.Service;

@Service
public class AleatorioService {

    public int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public String[] generarFraseAleatoria(){
        String[] palabras = {"No", "Que", "Perdon", "Gracias", "Como", "Cuando", "Quien",
         "Hola", "Adios", "Bienvenido", "Si", "Java", "Typescript", "Web", "Cliente", "Servidor", "Rafa",
         "Bien", "Mal", "Blog", "Post", "Palabra", "Aleatorio", "Honkai", "Alvaro",};
          String[] frase = new String[5];
            for (int i = 0; i < 5; i++) {
                int indiceAleatorio = generarNumeroAleatorio(0, palabras.length - 1);
                frase[i] = palabras[indiceAleatorio];
            }
            return frase;
    }

}
