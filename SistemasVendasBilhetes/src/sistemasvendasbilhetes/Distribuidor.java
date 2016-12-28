/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemasvendasbilhetes;

/**
 *
 * @author Notorius B.I.G
 */
public class Distribuidor extends Thread {
    
    private Bilheteria b;

    public Distribuidor(Bilheteria b) {
        super(" Distribuidor");
        this.b = b;
    }
    
    @Override
    public void run(){
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep((int) (Math.random()*3000));
            } catch (InterruptedException e) {
                System.out.println("\n" + e.toString());
            }
            b.setBilhete(i);
        }
        System.err.println("\n" + getName() + " Terminei!!!");
    }
    
    
}
