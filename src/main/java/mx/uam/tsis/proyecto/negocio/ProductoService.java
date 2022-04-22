package mx.uam.tsis.proyecto.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uam.tsis.proyecto.api.dto.ProductoDto;
import mx.uam.tsis.proyecto.datos.ProductoRepository;
import mx.uam.tsis.proyecto.negocio.modelo.Producto;


@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	

	public ProductoDto create(ProductoDto productoDto) {
		
		Producto p = Producto.builder()
				.nombre(productoDto.getNombre())
				.tipoProducto(productoDto.getTipoProducto())
				.build();
		
		// Validar reglas de negocio
		
		// Persistimos el producto
		p = productoRepository.save(p); // Aquí se le llena el id al producto
		
		// Generamos el dto que será regresado
		ProductoDto dto = ProductoDto.builder()
				.id(p.getId().toString())
				.nombre(p.getNombre())
				.tipoProducto(p.getTipoProducto())
				.build();
		
		return dto;
		
	}
	
}
