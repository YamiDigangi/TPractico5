
package tpractico5;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();
    
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
           if (materias.add(materia)) {
            JOptionPane.showMessageDialog(null, "El Alumno se agregó correctamente a la materia: "+ materia.toString());
           } else {
               JOptionPane.showMessageDialog(null, "Esa materia ya fue agregada anteriormente");
           }
    }
    
    public int cantidadMaterias(){
        //JOptionPane.showMessageDialog(null, "Estas inscripto a: " + materias.size() + " materias.");
        return materias.size();
    }

    @Override
    public String toString() {
        return  apellido +", "+ nombre;
    }
    
    
    }

    
    
