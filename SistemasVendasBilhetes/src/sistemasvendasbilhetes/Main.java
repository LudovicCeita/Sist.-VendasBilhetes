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
public class Main {
    
    public static void main (String []agrs){
       Bilheteria b = new Bilheteria();
       Distribuidor d = new Distribuidor(b);
       
       Comprador c1 = new Comprador(b, "Comprador1");
       Comprador c2 = new Comprador(b, "Comprador2");
       
       d.start();
       c1.start();
       c2.start();
    }
    
}
