package pe.edu.cibertec.appBaseDeDatos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.appBaseDeDatos.model.bd.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer >{
	
	
}
