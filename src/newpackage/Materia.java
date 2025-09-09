
package newpackage;

import java.util.Objects;

public class Materia {
    
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Materia: " + "id: " + idMateria + " nombre: " + nombre + " anio: " + anio;
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idMateria;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + this.anio;
        return hash;
    }
    
}
