package raul.cuenca.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import raul.cuenca.jwt.model.Bodega;
import raul.cuenca.jwt.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {
	
	@Autowired
	private BodegaRepository repositorio;

	@Override
	public List<Bodega> get() {
		return repositorio.findAll();
	}

}
