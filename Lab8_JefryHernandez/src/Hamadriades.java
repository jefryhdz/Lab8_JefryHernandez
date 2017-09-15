/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Hamadriades extends Hada {

    private int arbol = 173;

    public Hamadriades(String nombre, int Altura, int edad, double salud, double poder) {
        super(nombre, Altura, edad, salud, poder);
    }

    public int getArbol() {
        return arbol;
    }

    public void setArbol(int arbol) {
        this.arbol = arbol;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    public int pelea(Hada h, Hada h2) {
        int pelear = 0;

        pelear = (int) h2.getPoder();

        return pelear;
    }
}
