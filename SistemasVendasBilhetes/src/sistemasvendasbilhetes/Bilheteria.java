/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasvendasbilhetes;

import java.util.*;

/**
 *
 * @author Notorius B.I.G
 */
public class Bilheteria {

    private Vector conjBilhetes = new Vector();

    public synchronized int getBilhete() {

        if (conjBilhetes.size() == 0) {
            System.out.println(Thread.currentThread().getName() + "\n  Nao ha bilhetes\n");
            return -1;
        } else {
            System.out.println(Thread.currentThread().getName() + "\n  Bilhete Comprado num : " + ((Bilhete) conjBilhetes.get(0)).getNumero()+"\n");
            Bilhete b = (Bilhete) conjBilhetes.remove(0);
            return b.getNumero();
        }

    }
    
    
    public synchronized  void setBilhete(int val){
        
        System.out.println("\n" + Thread.currentThread().getName() + "  Bilhete emitido num :" + val + "\n");
        //junta bilhete a bilheteria
        conjBilhetes.add(new Bilhete(val));
    }

}
