package TrabajoPractico7.Main;

import TrabajoPractico7.Clases.*;

public class Colegio {
    public static void main(String[] args) {
        Materia m1 = new Materia(1, "Inglés I", 1);
        Materia m2 = new Materia(2, "Matemática", 1);
        Materia m3 = new Materia(3, "Laboratorio", 1);
        
        Alumno a1 = new Alumno(1001, "López", "Martín");
        Alumno a2 = new Alumno(1002, "Martínez", "Brenda");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
    }
}
