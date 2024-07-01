package med.voll.api.domain.direccion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosDireccion(@NotBlank
                             String calle,
                             @NotBlank
                             String distrito,
                             @NotBlank
                             String ciudad,
                             @NotBlank
                             String numero,
                             @NotBlank
                             String complemento) {
}
