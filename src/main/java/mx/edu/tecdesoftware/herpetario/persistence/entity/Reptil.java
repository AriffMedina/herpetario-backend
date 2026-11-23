package mx.edu.tecdesoftware.herpetario.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reptiles")
public class Reptil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reptil")
    private Integer idReptil;

    private String nombre;

    @Column(name = "id_especie")
    private Integer idEspecie;

    private String sexo;

    // Stored as a date so age is always computed, never stale.
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "peso_gramos")
    private Double pesoGramos;

    @Column(name = "ultima_alimentacion")
    private LocalDate ultimaAlimentacion;

    @Column(name = "image_url")
    private String imageUrl;

    private String notas;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_especie", insertable = false, updatable = false)
    private Especie especie;

    public Integer getIdReptil() { return idReptil; }
    public void setIdReptil(Integer idReptil) { this.idReptil = idReptil; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getIdEspecie() { return idEspecie; }
    public void setIdEspecie(Integer idEspecie) { this.idEspecie = idEspecie; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Double getPesoGramos() { return pesoGramos; }
    public void setPesoGramos(Double pesoGramos) { this.pesoGramos = pesoGramos; }

    public LocalDate getUltimaAlimentacion() { return ultimaAlimentacion; }
    public void setUltimaAlimentacion(LocalDate ultimaAlimentacion) { this.ultimaAlimentacion = ultimaAlimentacion; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getNotas() { return notas; }
    public void setNotas(String notas) { this.notas = notas; }

    public Boolean getEstado() { return estado; }
    public void setEstado(Boolean estado) { this.estado = estado; }

    public Especie getEspecie() { return especie; }
    public void setEspecie(Especie especie) { this.especie = especie; }
}
