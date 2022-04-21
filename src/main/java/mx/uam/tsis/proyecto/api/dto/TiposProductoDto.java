package mx.uam.tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TiposProductoDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-21T15:29:56.516895-05:00[America/Mexico_City]")


public class TiposProductoDto   {
  @JsonProperty("tiposProducto")
  @Valid
  private List<String> tiposProducto = null;

  public TiposProductoDto tiposProducto(List<String> tiposProducto) {
    this.tiposProducto = tiposProducto;
    return this;
  }

  public TiposProductoDto addTiposProductoItem(String tiposProductoItem) {
    if (this.tiposProducto == null) {
      this.tiposProducto = new ArrayList<String>();
    }
    this.tiposProducto.add(tiposProductoItem);
    return this;
  }

  /**
   * Get tiposProducto
   * @return tiposProducto
   **/
  @Schema(description = "")
  
    public List<String> getTiposProducto() {
    return tiposProducto;
  }

  public void setTiposProducto(List<String> tiposProducto) {
    this.tiposProducto = tiposProducto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiposProductoDto tiposProductoDto = (TiposProductoDto) o;
    return Objects.equals(this.tiposProducto, tiposProductoDto.tiposProducto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tiposProducto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiposProductoDto {\n");
    
    sb.append("    tiposProducto: ").append(toIndentedString(tiposProducto)).append("\n");
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
