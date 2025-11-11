package net.ausiasmarch.es.persutil.service;

import org.springframework.stereotype.Service;

@Service
public class AleatorioService {

    public int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
