package mx.uam.tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import mx.uam.tsis.proyecto.api.dto.ProductoDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListaProductosDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-21T15:29:56.516895-05:00[America/Mexico_City]")


public class ListaProductosDto   {
  @JsonProperty("productos")
  @Valid
  private List<ProductoDto> productos = null;

  public ListaProductosDto productos(List<ProductoDto> productos) {
    this.productos = productos;
    return this;
  }

  public ListaProductosDto addProductosItem(ProductoDto productosItem) {
    if (this.productos == null) {
      this.productos = new ArrayList<ProductoDto>();
    }
    this.productos.add(productosItem);
    return this;
  }

  /**
   * Get productos
   * @return productos
   **/
  @Schema(description = "")
      @Valid
    public List<ProductoDto> getProductos() {
    return productos;
  }

  public void setProductos(List<ProductoDto> productos) {
    this.productos = productos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaProductosDto listaProductosDto = (ListaProductosDto) o;
    return Objects.equals(this.productos, listaProductosDto.productos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaProductosDto {\n");
    
    sb.append("    productos: ").append(toIndentedString(productos)).append("\n");
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
