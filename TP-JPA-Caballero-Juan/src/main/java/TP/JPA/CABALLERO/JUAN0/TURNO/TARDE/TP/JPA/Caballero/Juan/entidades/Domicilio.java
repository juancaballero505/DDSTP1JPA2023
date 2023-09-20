package TP.JPA.CABALLERO.JUAN0.TURNO.TARDE.TP.JPA.Caballero.Juan.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Domicilio implements Serializable {
    @Id
    private Long Id;
    private String calle;
    private String numero;
    private String localidad;



}
