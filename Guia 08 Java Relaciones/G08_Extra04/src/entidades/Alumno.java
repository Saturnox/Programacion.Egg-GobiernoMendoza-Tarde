/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes
atributos: nombre completo, DNI y cantidad de votos

 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Adrian E. Camus
 */
public class Alumno {
    private String nombre;
    private String dni;
    private Integer cantVotos;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, Integer cantVotos) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.dni);
        hash = 37 * hash + Objects.hashCode(this.cantVotos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.cantVotos, other.cantVotos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", cantVotos=" + cantVotos + '}';
    }
    
    
}
