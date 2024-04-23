package com.MC.Ejercicio4.repository;

import com.MC.Ejercicio4.entity.Gatito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GatitoRepository extends JpaRepository<Gatito, Long> {
}
