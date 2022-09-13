/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpractico5;

/**
 *
 * @author SANTI
 */
public class Colegio {
    public static void main(String args[]){

    
        Materia materia1 = new Materia(001,"Laboratorio I",1);
        Materia materia2 = new Materia(002,"Matemáticas I",1);
        Materia materia3 = new Materia(003,"Ingles I",1);
        
        Alumno alu1 = new Alumno(1001,"López","Martin");
        Alumno alu2 = new Alumno(1002,"Martinez","Brenda");
        
        alu1.agregarMateria(materia1);
        alu1.agregarMateria(materia2);
        alu1.agregarMateria(materia3);
        alu1.cantidadMaterias();
        
//        alu2.agregarMateria(materia1);
//        alu2.agregarMateria(materia2);
//        alu2.agregarMateria(materia3);
//        alu2.agregarMateria(materia1);
//        alu2.cantidadMaterias();

    }
}
