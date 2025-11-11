package net.ausiasmarch.es.persutil.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ausiasmarch.es.persutil.entity.BlogEntity;
import net.ausiasmarch.es.persutil.repository.BlogRepository;

@Service
public class BlogService {
    

    @Autowired
    BlogRepository oBlogRepository;

    public Long rellenaBlog(){
        BlogEntity oBlogEntity = new BlogEntity();
        oBlogEntity.setTitulo("Mi primer blog");
        oBlogEntity.setContenido("Contenido del blog");
        oBlogEntity.setEtiquetas("eitqueta1, etiqueta2");
        oBlogEntity.setFechaCreacion(LocalDateTime.now());
        oBlogEntity.setFechamodificacion(null);
        oBlogRepository.save(oBlogEntity);
        return oBlogRepository.count();
    }


}
