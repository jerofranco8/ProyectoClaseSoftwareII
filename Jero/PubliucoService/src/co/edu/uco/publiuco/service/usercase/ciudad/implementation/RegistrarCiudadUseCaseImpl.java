package co.edu.uco.publiuco.service.usercase.ciudad.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.repository.CiudadRepository;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.usercase.ciudad.RegistrarCiudad;

public class RegistrarCiudadUseCaseImpl implements RegistrarCiudad{
	
	@Autowired
	private CiudadRepository repository;
	
	@Override
	public void execute (CiudadDomain domain) {
		//Crear las reglas de negocio
		//Especificacion pattern o validator pattern
		
		//Aqui deberas Crear el ensamblador
		
		CiudadEntity entity = null;
		repository.save(entity);
	}
}
