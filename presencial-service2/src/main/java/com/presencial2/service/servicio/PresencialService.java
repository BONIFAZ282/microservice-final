package com.presencial2.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.presencial2.service.entity.Presencial;
import com.presencial2.service.repository.PresencialRepository;


@Service
public class PresencialService {

	@Autowired
	private PresencialRepository presencialRepository;
	
	public List<Presencial> getAll(){
		return presencialRepository.findAll();
	}
	
	public Presencial getPresencialById(int id) {
		return presencialRepository.findById(id).orElse(null);
	}
	
	public Presencial save(Presencial presencial) {
		Presencial nuevoPresencial = presencialRepository.save(presencial);
		return nuevoPresencial;
	}
	
	public List<Presencial> byUniversidadId(int universidadId){
		return presencialRepository.findByUniversidadId(universidadId);
	}
}
