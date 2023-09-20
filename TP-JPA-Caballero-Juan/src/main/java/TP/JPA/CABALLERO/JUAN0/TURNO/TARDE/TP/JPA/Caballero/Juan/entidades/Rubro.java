package TP.JPA.CABALLERO.JUAN0.TURNO.TARDE.TP.JPA.Caballero.Juan.entidades;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rubro implements Serializable {
    @Id


    private Long Id;
    private String denominacion;

}
