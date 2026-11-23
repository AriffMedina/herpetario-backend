package mx.edu.tecdesoftware.herpetario.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especie")
    private Integer idEspecie;

    @Column(name = "nombre_comun")
    private String nombreComun;

    @Column(name = "nombre_cientifico")
    private String nombreCientifico;

    // Care requirements live on the species, not on each pet:
    // every animal of the same species shares them.
    @Column(name = "frecuencia_alimentacion_dias")
    private Integer frecuenciaAlimentacionDias;

    @Column(name = "temp_min")
    private Double tempMin;

    @Column(name = "temp_max")
    private Double tempMax;

    @Column(name = "humedad_min")
    private Integer humedadMin;

    @Column(name = "humedad_max")
    private Integer humedadMax;

    private String dieta;

    private Boolean estado;

    public Integer getIdEspecie() { return idEspecie; }
    public void setIdEspecie(Integer idEspecie) { this.idEspecie = idEspecie; }

    public String getNombreComun() { return nombreComun; }
    public void setNombreComun(String nombreComun) { this.nombreComun = nombreComun; }

    public String getNombreCientifico() { return nombreCientifico; }
    public void setNombreCientifico(String nombreCientifico) { this.nombreCientifico = nombreCientifico; }

    public Integer getFrecuenciaAlimentacionDias() { return frecuenciaAlimentacionDias; }
    public void setFrecuenciaAlimentacionDias(Integer frecuenciaAlimentacionDias) { this.frecuenciaAlimentacionDias = frecuenciaAlimentacionDias; }

    public Double getTempMin() { return tempMin; }
    public void setTempMin(Double tempMin) { this.tempMin = tempMin; }

    public Double getTempMax() { return tempMax; }
    public void setTempMax(Double tempMax) { this.tempMax = tempMax; }

    public Integer getHumedadMin() { return humedadMin; }
    public void setHumedadMin(Integer humedadMin) { this.humedadMin = humedadMin; }

    public Integer getHumedadMax() { return humedadMax; }
    public void setHumedadMax(Integer humedadMax) { this.humedadMax = humedadMax; }

    public String getDieta() { return dieta; }
    public void setDieta(String dieta) { this.dieta = dieta; }

    public Boolean getEstado() { return estado; }
    public void setEstado(Boolean estado) { this.estado = estado; }
}
