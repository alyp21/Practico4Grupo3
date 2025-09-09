
package newpackage;

public class Colegio {

    public static void main(String[] args) {
       
        Materia web2 = new Materia(123, "Web2",2);
        Materia matematicas = new Materia(456,"Matematicas",1);
        Materia lab1 = new Materia(789, "Laboratorio1",1);
        
        Alumno lopez = new Alumno(1001,"Martin","Lopez");
        Alumno martinez = new Alumno(1002,"Brenda","Martinez");
        
        lopez.agregarMateria(web2);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(lab1);
        martinez.agregarMateria(web2);
        martinez.agregarMateria(lab1);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(lab1); //repetimos la inscripcion pq lo pide en la consigna !!!
        
        System.out.println("Cantidad de materias inscriptas de Lopez: " + lopez.cantidadMaterias());
        System.out.println("Cantidad de materias inscriptas de Martinez: " + martinez.cantidadMaterias());
    }
    
}
