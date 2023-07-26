package com.universidad2.service.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universidad2.service.entidades.Universidad;



@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer>{

}
