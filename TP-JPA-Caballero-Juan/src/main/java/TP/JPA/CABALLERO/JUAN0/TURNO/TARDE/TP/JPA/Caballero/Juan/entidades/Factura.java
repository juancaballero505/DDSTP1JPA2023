package TP.JPA.CABALLERO.JUAN0.TURNO.TARDE.TP.JPA.Caballero.Juan.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Factura implements Serializable {

   @Id

   private Long Id;
   private int numero;
   private LocalDate fecha;
   private double descuento;
   private String formaDePago;
   private double total;

}
