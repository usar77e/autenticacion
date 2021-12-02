package er.dan.autenticacion.model;

import javax.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer IdLibro;

    @Column(name = "nombre", length = 70)
    private String nombre;

    public Integer getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(Integer idLibro) {
        IdLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
