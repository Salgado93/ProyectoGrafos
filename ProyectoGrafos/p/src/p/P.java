/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

/**
 *
 * @author luigy
 */
public class P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola c=new Cola();
        c.queue(1);
        c.queue(2);
        c.queue(3);
        c.queue(4);
        c.queue(5);
        while(!c.isEmpty()){
            System.out.print("["+c.Dequeue()+"]");
        }
    }
    
}
