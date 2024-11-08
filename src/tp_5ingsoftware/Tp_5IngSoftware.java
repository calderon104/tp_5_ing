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
public class Tp_5IngSoftware {

    public static void main(String[] args) {
        profesor profe = new profesor("Ricardo");
        ArrayList<Materia> asignaturas = new ArrayList<>();
        Materia m1 = new Materia("Ing. software", 5);
        Materia m2 = new Materia("Matematicas", 3);
        Materia m3 = new Materia("Laboratorio", 7);
        asignaturas.add(m1);
        asignaturas.add(m2);
        asignaturas.add(m3);
        profe.setMaterias(asignaturas);
        System.out.println("Profesor "+ profe);
        System.out.println("Carga horaria "+ profe.calcularCarga(asignaturas));
        System.out.println("Cantidad a corregir : "+profe.repartirGrupo(32, 4));
    }

}
