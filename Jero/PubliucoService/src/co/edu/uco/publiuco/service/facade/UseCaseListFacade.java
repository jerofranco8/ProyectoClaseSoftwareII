package co.edu.uco.publiuco.service.facade;

import java.util.List;

public interface UseCaseListFacade<T> {
	List<T> execute (Optional<T> dto);
}
