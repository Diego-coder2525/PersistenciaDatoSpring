package pe.edu.cibertec.appBaseDeDatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.appBaseDeDatos.model.bd.Estado;
import pe.edu.cibertec.appBaseDeDatos.repositorio.EstadoRepository;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listarEstado(){
		return estadoRepository.findAll();
	}
	public void registrarEstado(Estado estado) {
		estadoRepository.save(estado);
	}
	
}
