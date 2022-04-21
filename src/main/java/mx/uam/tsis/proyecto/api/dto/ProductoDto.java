package mx.uam.tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductoDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-21T15:29:56.516895-05:00[America/Mexico_City]")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("tipoProducto")
  private String tipoProducto = null;

  public ProductoDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * el identificador del producto
   * @return id
   **/
  @Schema(example = "1234", description = "el identificador del producto")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductoDto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * el nombre del producto
   * @return nombre
   **/
  @Schema(example = "Transformers", required = true, description = "el nombre del producto")
      @NotNull

    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ProductoDto tipoProducto(String tipoProducto) {
    this.tipoProducto = tipoProducto;
    return this;
  }

  /**
   * el tipo del producto
   * @return tipoProducto
   **/
  @Schema(example = "Juguete", description = "el tipo del producto")
  
    public String getTipoProducto() {
    return tipoProducto;
  }

  public void setTipoProducto(String tipoProducto) {
    this.tipoProducto = tipoProducto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductoDto productoDto = (ProductoDto) o;
    return Objects.equals(this.id, productoDto.id) &&
        Objects.equals(this.nombre, productoDto.nombre) &&
        Objects.equals(this.tipoProducto, productoDto.tipoProducto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, tipoProducto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductoDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    tipoProducto: ").append(toIndentedString(tipoProducto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
