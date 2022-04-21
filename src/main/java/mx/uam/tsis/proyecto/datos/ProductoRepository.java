package mx.uam.tsis.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import mx.uam.tsis.proyecto.negocio.modelo.Producto;

public interface ProductoRepository extends CrudRepository<Producto, String> {

}
