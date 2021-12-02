package er.dan.autenticacion.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

    LocalDateTime timestamp;
    String mensaje;
    String detalle;

    public ExceptionResponse(LocalDateTime timestamp, String mensaje, String detalle) {
        this.timestamp = timestamp;
        this.mensaje = mensaje;
        this.detalle = detalle;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
