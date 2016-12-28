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
public class Comprador extends Thread{
    
    private Bilheteria b;
    private static boolean fim;

    public Comprador(Bilheteria b, String name) {
        super(name);
        this.b = b;
        fim = false;
    }

    @Override
    public void run(){
        int valor = 0;
        
        while(!fim){
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {
                System.out.println("\n" + e.toString());
            }
            
            if(fim == false)
                valor = b.getBilhete();
                if(valor == 20){
                    fim = true;
                }
               // System.out.println("\nSucesso "+ getName() + " Bilhetes Comprados!!!\n");
        }
    }
    
    
    
    
}
