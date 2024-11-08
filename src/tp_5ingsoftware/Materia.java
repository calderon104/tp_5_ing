/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_5ingsoftware;

/**
 *
 * @author Gonza
 */
public class Materia {
    private String nombre;
    private int cargaHoraria;
    Materia(String nombre, int i) {
        this.nombre=nombre;
        this.cargaHoraria=i;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
