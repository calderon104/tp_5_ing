/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_5ingsoftware;

import java.util.ArrayList;

/**
 *
 * @author Gonza
 */
public class profesor {
    String nombre;
    ArrayList <Materia> materias;

    @Override
    public String toString() {
        return "profesor{" + "nombre=" + nombre + ", materias=" + materias + '}';
    }

    public profesor(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int calcularCarga(ArrayList <Materia> materias){
        int carga=0;
        for (Materia materia: materias){
        carga+=materia.getCargaHoraria();
        }
        return carga;
    }
    
    int repartirGrupo(int alumnos,int profesores){
        return alumnos/profesores;
        }
    }

