
package newpackage;

import java.util.HashSet;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    HashSet <Materia> materias = new HashSet<>();

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno " + nombre + " " + apellido;
    }
    
    public void agregarMateria(Materia m){
             if (materias.add(m)== true) {
            JOptionPane.showMessageDialog(null, "El alumno se inscribio correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto.");
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.legajo;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellido);
        hash = 23 * hash + Objects.hashCode(this.materias);
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
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.materias, other.materias);
    }
    
    public int cantidadMaterias(){
        
        return materias.size();
        
    }
    //hola
}
