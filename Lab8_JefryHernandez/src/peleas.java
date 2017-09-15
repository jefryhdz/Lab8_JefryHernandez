
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class peleas extends Thread {

    private JProgressBar p1;
    private JProgressBar p2;
    private Hada hada;
    private Hada hada2;

    public peleas(JProgressBar p1, JProgressBar p2, Hada hada, Hada hada2) {
        this.p1 = p1;
        this.p2 = p2;
        this.hada = hada;
        this.hada2 = hada2;
    }

    public JProgressBar getP1() {
        return p1;
    }

    public void setP1(JProgressBar p1) {
        this.p1 = p1;
    }

    public JProgressBar getP2() {
        return p2;
    }

    public void setP2(JProgressBar p2) {
        this.p2 = p2;
    }

    public Hada getHada() {
        return hada;
    }

    public void setHada(Hada hada) {
        this.hada = hada;
    }

    public Hada getHada2() {
        return hada2;
    }

    public void setHada2(Hada hada2) {
        this.hada2 = hada2;
    }

    @Override
    public synchronized void start() {
        p1.setMaximum((int) hada.getSalud());
        p1.setValue((int) hada.getSalud());
        p2.setMaximum((int) hada2.getSalud());
        p2.setValue((int) hada2.getSalud());
        while (p1.getValue() > 0 && p2.getValue() > 0) {
            p1.setValue(p2.getValue() - (int)hada.getPoder());
            hada.setSalud();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(peleas.class.getName()).log(Level.SEVERE, null, ex);
            }
            p2.setValue(p1.getValue() - (int)hada2.getPoder());

        }
    }

}
