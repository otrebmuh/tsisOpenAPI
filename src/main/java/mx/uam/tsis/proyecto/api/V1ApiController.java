package mx.uam.tsis.proyecto.api;

import mx.uam.tsis.proyecto.api.dto.ErrorDto;
import mx.uam.tsis.proyecto.api.dto.ListaProductosDto;
import mx.uam.tsis.proyecto.api.dto.ProductoDto;
import mx.uam.tsis.proyecto.api.dto.TiposProductoDto;
import mx.uam.tsis.proyecto.negocio.ProductoService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-21T15:29:56.516895-05:00[America/Mexico_City]")
@RestController
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private ProductoService productoService;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ProductoDto> createProduct(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ProductoDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	
            	ProductoDto dto = productoService.create(body);
            	
                //return new ResponseEntity<ProductoDto>(dto).status(HttpStatus.CREATED);
            	return ResponseEntity
            			.status(HttpStatus.CREATED)
            			.header("Location", "/v1/productos/"+dto.getId())
            			.body(dto);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProduct(@Parameter(in = ParameterIn.PATH, description = "el identificador del producto generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("productoId") String productoId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListaProductosDto> getAllProducts(@Parameter(in = ParameterIn.QUERY, description = "filtro por tipo de producto" ,schema=@Schema()) @Valid @RequestParam(value = "tipoProducto", required = false) String tipoProducto) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListaProductosDto>(objectMapper.readValue("{\n  \"productos\" : [ {\n    \"tipoProducto\" : \"Juguete\",\n    \"id\" : \"1234\",\n    \"nombre\" : \"Transformers\"\n  }, {\n    \"tipoProducto\" : \"Juguete\",\n    \"id\" : \"1234\",\n    \"nombre\" : \"Transformers\"\n  } ]\n}", ListaProductosDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListaProductosDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListaProductosDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductoDto> getProduct(@Parameter(in = ParameterIn.PATH, description = "el identificador del producto generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("productoId") String productoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductoDto>(objectMapper.readValue("{\n  \"tipoProducto\" : \"Juguete\",\n  \"id\" : \"1234\",\n  \"nombre\" : \"Transformers\"\n}", ProductoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TiposProductoDto> getProductTypes() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TiposProductoDto>(objectMapper.readValue("\"{\n   \"tiposProducto\": [\n      \"Juguete\",\"Electrónico\",\"Alimento\"\n      ]\n}\"", TiposProductoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TiposProductoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TiposProductoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductoDto> updateProduct(@Parameter(in = ParameterIn.PATH, description = "el identificador del producto generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("productoId") String productoId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ProductoDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductoDto>(objectMapper.readValue("{\n  \"tipoProducto\" : \"Juguete\",\n  \"id\" : \"1234\",\n  \"nombre\" : \"Transformers\"\n}", ProductoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
