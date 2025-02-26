package com.msvc.usuario.entities;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {

    private String calificacionId;
    private String usuarioId;
    private String hotelId;
    private int calificacion;
    private String observaciones;

    @Transient
    private Hotel hotel;

}
