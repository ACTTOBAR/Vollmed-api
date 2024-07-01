package med.voll.api.domain.paciente;

import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRespuestaPaciente(Long id,
                                     String nombre,
                                     String documentoIdentidad,
                                     String email,
                                     String telefono,
                                     DatosDireccion datosDireccion) {
}

