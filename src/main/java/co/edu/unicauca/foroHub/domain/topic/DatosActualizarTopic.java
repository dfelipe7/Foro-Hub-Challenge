package co.edu.unicauca.foroHub.domain.topic;
public record DatosActualizarTopic(
        String titulo,
        String autor,
        String mensaje,
        Curso curso,
        String status
) {
}