package TrabajoPractico7.Clases;

import java.util.HashSet;

public class Alumno {
    private int legajo;
    private String apellido;
    private String Nombre;
    
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String Nombre, HashSet<Materia> materias) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.Nombre = Nombre;
        
        this.materias = materias;
    }
    
    /* GETTERS */

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return Nombre;
    }
    
    /* SETTERS */

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /* MÉTODOS */
    
    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }
    
    public int cantidadMaterias() {
        return materias.size();
    }
    
    /* OVERRIDES */

    @Override
    public String toString() {
        return "Alumno{" + "apellido=" + apellido + ", Nombre=" + Nombre + '}';
    }

    @Override
    public int hashCode() {
        return legajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Alumno)){
            return false;
        } else {
            Alumno otra = (Alumno)obj;
            
            return legajo == otra.getLegajo();
        }
    }
    
    
}
