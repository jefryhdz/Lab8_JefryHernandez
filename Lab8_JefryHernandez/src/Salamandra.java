/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Salamandra extends Hada {

    private int alas;

    public Salamandra(int alas, String nombre, int Altura, int edad, double salud, double poder) {
        super(nombre, Altura, edad, salud, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
