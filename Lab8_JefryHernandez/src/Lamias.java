/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Lamias extends Hada{
    private int aleta;
    private int branquea;
    private boolean canto;

    public Lamias(int aleta, int branquea, boolean canto, String nombre, int Altura, int edad, double salud, double poder) {
        super(nombre, Altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquea = branquea;
        this.canto = canto;
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

    public boolean isCanto() {
        return canto;
    }

    public void setCanto(boolean canto) {
        this.canto = canto;
    }
    
}