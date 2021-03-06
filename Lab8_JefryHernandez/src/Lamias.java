/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Lamias extends Hada {

    private int aleta;
    private int branquea;

    public Lamias(int aleta, int branquea, String nombre, int Altura, int edad, double salud, double poder) {
        super(nombre, Altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquea = branquea;

    }

    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        this.aleta = aleta;
    }

    public int getBranquea() {
        return branquea;
    }

    public void setBranquea(int branquea) {
        this.branquea = branquea;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

    @Override
    public int pelea(Hada h, Hada h2) {
        int pelear = 0;
        if (h instanceof Salamandra) {
            pelear = (int) (h2.getPoder() + ((int) h2.getPoder() * 0.42));
        } else {
            pelear = (int) h2.getPoder();
        }
        return pelear;
    }
}
