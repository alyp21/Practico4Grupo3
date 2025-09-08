
package newpackage;

import java.util.HashSet;

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
    public void agregarMateria(Materia m){
             if (materias.add(m)) {
            System.out.println(nombre + " se inscribio en " + m.getNombre());
        } else {
            System.out.println(nombre + " ya estaba inscripto en " + m.getNombre());
        }
    }
    public int cantidadMaterias(){
        
        return materias.size();
        
    }
    //hola
}
