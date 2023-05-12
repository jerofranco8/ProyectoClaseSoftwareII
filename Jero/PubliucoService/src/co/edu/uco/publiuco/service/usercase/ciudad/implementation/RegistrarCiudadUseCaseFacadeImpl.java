package co.edu.uco.publiuco.service.usercase.ciudad.implementation;

import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.dto.CiudadDTO;
import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.facade.ciudad.RegistrarCiudadUseCaseFacade;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistrarCiudadUseCaseFacadeImpl implements RegistrarCiudadUseCaseFacade{
	
	@AutoWired 
	
	private RegistrarCiudadUseCase useCase;
	
	@Override
	public void execute (CiudadDTO dto) {
		
		//Sirve el assembler para lelvar el DTO a domain
		
		CiudadDomain domain = null;
		
		useCase.execute(domain);
	}
}
