package net.ausiasmarch.es.persutil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.ausiasmarch.es.persutil.entity.BlogEntity;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {
    
    
}
