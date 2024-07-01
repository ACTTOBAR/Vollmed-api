package med.voll.api.domain.paciente;

public record DatosListaPaciente(String nombre,
                                 String email,
                                 String documentoIdentidad,
                                 String telefono) {

    public DatosListaPaciente(Paciente paciente) {
            this(paciente.getNombre(), paciente.getEmail(), paciente.getDocumentoIdentidad(), paciente.getTelefono());
    }
}
