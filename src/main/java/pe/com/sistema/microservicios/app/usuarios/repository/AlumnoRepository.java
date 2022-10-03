package pe.com.sistema.microservicios.app.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import pe.com.sistema.microservicios.app.usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

}
