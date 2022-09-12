
package tpractico5;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    Set<Materia>materias = new HashSet<>();
    
    public Alumno() {
    }
    

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia materia){
            materias.add(materia);
            JOptionPane.showMessageDialog(null, "Materia agregada");
     
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }
    
    Set<Materia>getMaterias(){
        return materias;
    }

    @Override
    public String toString() {
        return "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias ;
    }
    
    
}
